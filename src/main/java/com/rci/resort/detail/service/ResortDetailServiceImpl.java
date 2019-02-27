package com.rci.resort.detail.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.rci.resort.detail.mapper.ResortMapper;
import com.rci.resort.detail.model.ResortDetail;
import com.rci.resort.detail.model.ResortDetailsResponse;
import com.rci.resort.detail.repository.ResortRepository;
import com.rci.resort.detail.rest.AvailableUnitsServiceProxy;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ResortDetailServiceImpl implements ResortDetailService {

	@Autowired
	private ResortRepository resortRepository;
	
	@Autowired
	private ResortDetailsResponse resortDetailsResponse;
	
	@Autowired
	private AvailableUnitsServiceProxy auProxy;
	
	@Autowired
	private ResortMapper resortMapper;
	
	@Override
	public List<ResortDetail> getResortDetails() {
		log.info("get resort details service");
		return resortRepository.findAll().parallelStream().map(resortMapper::map).collect(Collectors.toList());
	}

	@Override
	public ResortDetail getResortDetailsbyId(String resortCode) {
		log.info("getResortDetailsbyId call");
		return resortRepository.findById(resortCode).map(resortMapper::map).orElse(null);
	}
	
	@Override
	@Cacheable(value="resorts", key="#resordCode")
	public ResortDetailsResponse getAvailableUnitsbyId(String resordCode) {
		log.info("getAvailableUnitsbyId call");
		
		resortDetailsResponse.setResortDetail(resortRepository.findById(resordCode).map(resortMapper::map).orElse(null));
		resortDetailsResponse.setAvailableUnitsList(auProxy.getAvailableUnits(resordCode));
		
		return resortDetailsResponse;
	}

}

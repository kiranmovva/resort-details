package com.rci.resort.detail.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rci.resort.detail.model.ResortDetail;
import com.rci.resort.detail.model.ResortDetailsResponse;

@Service
public interface ResortDetailService {
   
    List<ResortDetail> getResortDetails();

	ResortDetail getResortDetailsbyId(String resordCode);

	ResortDetailsResponse getAvailableUnitsbyId(String resordCode);
	
}

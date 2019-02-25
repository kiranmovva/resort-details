package com.rci.resort.detail.rest;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.rci.resort.detail.model.AvailableUnits;

@FeignClient(name="available-units-service",url="http://localhost:8183")
public interface AvailableUnitsServiceProxy {
	
	@GetMapping("/availableUnitsById")
	public List<AvailableUnits> getAvailableUnits(@RequestParam(defaultValue="0450") String resortCode);

}

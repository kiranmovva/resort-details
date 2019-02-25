package com.rci.resort.detail.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rci.resort.detail.model.ResortDetail;
import com.rci.resort.detail.model.ResortDetailsResponse;
import com.rci.resort.detail.service.ResortDetailService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags="resorts-API",produces="application/json")
public class ResortDetailController {

	@Autowired
	private ResortDetailService resortSerivce;
	
	@GetMapping(value="/resortDetails")
	@ApiOperation(value="resort details", notes="this is the resort request",consumes="application/json", produces="application/json")
	public ResponseEntity<List<ResortDetail>>  getResortDetails() {
		return new ResponseEntity<List<ResortDetail>>(resortSerivce.getResortDetails(),HttpStatus.OK);
		
	}
	
	@GetMapping(value="/resortByID")
	@ApiOperation(value="resort details by ID", notes="this is the resort request by ID ",consumes="application/json", produces="application/json")
	public ResponseEntity<ResortDetail>  getResortDetailsbyId(@RequestParam(defaultValue="3726") String resordCode) {
		return new ResponseEntity<ResortDetail>(resortSerivce.getResortDetailsbyId(resordCode),HttpStatus.OK);
		
	}
	
	@GetMapping(value="/availableUnitsByID")
	@ApiOperation(value="availableUnits by resort ID", notes="availableUnits resort request by ID ",consumes="application/json", produces="application/json")
	public ResponseEntity<ResortDetailsResponse>  getAvailableUnitsbyId(@RequestParam(defaultValue="3726") String resordCode) {
		return new ResponseEntity<ResortDetailsResponse>(resortSerivce.getAvailableUnitsbyId(resordCode),HttpStatus.OK);
		
	}
}

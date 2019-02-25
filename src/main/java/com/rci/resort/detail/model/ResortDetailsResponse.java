package com.rci.resort.detail.model;

import java.util.List;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("Resort Details resposne")
public class ResortDetailsResponse {
	
	private ResortDetail resortDetail;
	
	private List<AvailableUnits> availableUnitsList;
	
}

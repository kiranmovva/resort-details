package com.rci.resort.detail.model;

import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("Resort Details resposne")
public class ResortDetailsResponse implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private ResortDetail resortDetail;
	
	private List<AvailableUnits> availableUnitsList;
	
}

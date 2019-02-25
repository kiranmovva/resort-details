package com.rci.resort.detail.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class AvailableUnits implements Serializable{


	private static final long serialVersionUID = 1L;

	private String unitNumber;
	private String resortId;
	private String bedroomCode;
	private String maxOccupency;
	private String kitchenType;
}

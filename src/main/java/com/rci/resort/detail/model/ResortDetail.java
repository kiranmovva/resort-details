package com.rci.resort.detail.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("Resort Details information")
public class ResortDetail implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	private String resortCode;
	private String langCode;
	private String regionCode;
	private String resortName;
	private char webStatusFlg;
	private char affilativeStatus;
	
	
	
}

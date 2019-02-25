package com.rci.resort.detail.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@Entity
@ApiModel
@Table(name="RESORT",schema="ODSCUSTOMER")
public class ResortEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="RESORTCODE",columnDefinition="resort code value")
	private String resortCode;
	
	@Column(name="LANGUAGECODE",columnDefinition="language code")
	private String languageCode;
	
	@Column(name="REGIONCODE",columnDefinition="region code")
	private String regionCode;
	
	@Column(name="RESORTNAME",columnDefinition="resort name")
	private String resortName;
	
	@Column(name="WEB_STATUS_FLG",columnDefinition="web status flag")
	private char webStatusFlg;
	
	@Column(name="AFFIL_STATUS",columnDefinition="affliate status")
	private String affilStatus;
	
	
	

}

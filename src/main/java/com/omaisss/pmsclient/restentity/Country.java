package com.omaisss.pmsclient.restentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")

public class Country extends BaseEntity{
	
	@Id
	@Column(name="country_id")
	private int countryId;

	@Column(name="code")
	private String code;

	@Column(name="name")
	private String name;

	@Column(name="name_ar")
	private String nameAr;

	@Column(name="nationality")
	private String nationality;

	@Column(name="nationality_ar")
	private String nationalityAr;
	
	@Column(name="ntmp_code")
	private String ntmpCode;
	
	@Column(name="ntmp_name")
	private String ntmpName;
	
	@Column(name="g_c_c",nullable = true)
	private int gcc;
	
	@Column(name="is_active")
	private int isActive;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameAr() {
		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNationalityAr() {
		return nationalityAr;
	}

	public void setNationalityAr(String nationalityAr) {
		this.nationalityAr = nationalityAr;
	}

	public String getNtmpCode() {
		return ntmpCode;
	}

	public void setNtmpCode(String ntmpCode) {
		this.ntmpCode = ntmpCode;
	}

	public String getNtmpName() {
		return ntmpName;
	}

	public void setNtmpName(String ntmpName) {
		this.ntmpName = ntmpName;
	}

	public int getGcc() {
		return gcc;
	}

	public void setGcc(int gcc) {
		this.gcc = gcc;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}


}


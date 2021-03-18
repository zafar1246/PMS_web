package com.omaisss.pms.restdomainobjects;

import java.time.LocalDateTime;

public class GuestProfileVO extends BaseVO {

	private int guestProfileId;
	private int folioNo;
	private int guestProfileSourceId;
	private int contractProfileId;
	private int titleId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String firstName1;
	private String middleName1;
	private String lastName1;
	private int gender;
	private String dob;
	private int age;
	private int ageUnit;
	private int civilStatus;
	private String mobile;
	private int nationalIdType;
	private String nationalId;
	private String nationalIdImage;
	private int nationality;
	private int guestProfileStatus;
	private String remarks;
	private char isContract;

	public int getGuestProfileId() {
		return guestProfileId;
	}

	public void setGuestProfileId(int guestProfileId) {
		this.guestProfileId = guestProfileId;
	}

	public int getFolioNo() {
		return folioNo;
	}

	public void setFolioNo(int folioNo) {
		this.folioNo = folioNo;
	}

	public int getGuestProfileSourceId() {
		return guestProfileSourceId;
	}

	public void setGuestProfileSourceId(int guestProfileSourceId) {
		this.guestProfileSourceId = guestProfileSourceId;
	}

	public int getContractProfileId() {
		return contractProfileId;
	}

	public void setContractProfileId(int contractProfileId) {
		this.contractProfileId = contractProfileId;
	}

	public int getTitleId() {
		return titleId;
	}

	public void setTitleId(int titleId) {
		this.titleId = titleId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName1() {
		return firstName1;
	}

	public void setFirstName1(String firstName1) {
		this.firstName1 = firstName1;
	}

	public String getMiddleName1() {
		return middleName1;
	}

	public void setMiddleName1(String middleName1) {
		this.middleName1 = middleName1;
	}

	public String getLastName1() {
		return lastName1;
	}

	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAgeUnit() {
		return ageUnit;
	}

	public void setAgeUnit(int ageUnit) {
		this.ageUnit = ageUnit;
	}

	public int getCivilStatus() {
		return civilStatus;
	}

	public void setCivilStatus(int civilStatus) {
		this.civilStatus = civilStatus;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getNationalIdType() {
		return nationalIdType;
	}

	public void setNationalIdType(int nationalIdType) {
		this.nationalIdType = nationalIdType;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getNationalIdImage() {
		return nationalIdImage;
	}

	public void setNationalIdImage(String nationalIdImage) {
		this.nationalIdImage = nationalIdImage;
	}

	public int getNationality() {
		return nationality;
	}

	public void setNationality(int nationality) {
		this.nationality = nationality;
	}

	public int getGuestProfileStatus() {
		return guestProfileStatus;
	}

	public void setGuestProfileStatus(int guestProfileStatus) {
		this.guestProfileStatus = guestProfileStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public char getIsContract() {
		return isContract;
	}

	public void setIsContract(char isContract) {
		this.isContract = isContract;
	}

	@Override
	public String toString() {
		return "GuestProfileVO [guestProfileId=" + guestProfileId + ", folioNo=" + folioNo + ", guestProfileSourceId="
				+ guestProfileSourceId + ", contractProfileId=" + contractProfileId + ", titleId=" + titleId
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", firstName1="
				+ firstName1 + ", middleName1=" + middleName1 + ", lastName1=" + lastName1 + ", gender=" + gender
				+ ", dob=" + dob + ", age=" + age + ", ageUnit=" + ageUnit + ", civilStatus=" + civilStatus
				+ ", mobile=" + mobile + ", nationalIdType=" + nationalIdType + ", nationalId=" + nationalId
				+ ", nationalIdImage=" + nationalIdImage + ", nationality=" + nationality + ", guestProfileStatus="
				+ guestProfileStatus + ", remarks=" + remarks + ", isContract=" + isContract + "]";
	}

	public GuestProfileVO(int guestProfileId, int folioNo, int guestProfileSourceId, int contractProfileId, int titleId,
			String firstName, String middleName, String lastName, String firstName1, String middleName1,
			String lastName1, int gender, String dob, int age, int ageUnit, int civilStatus, String mobile,
			int nationalIdType, String nationalId, String nationalIdImage, int nationality, int guestProfileStatus,
			String remarks, char isContract) {
		super();
		this.guestProfileId = guestProfileId;
		this.folioNo = folioNo;
		this.guestProfileSourceId = guestProfileSourceId;
		this.contractProfileId = contractProfileId;
		this.titleId = titleId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.firstName1 = firstName1;
		this.middleName1 = middleName1;
		this.lastName1 = lastName1;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.ageUnit = ageUnit;
		this.civilStatus = civilStatus;
		this.mobile = mobile;
		this.nationalIdType = nationalIdType;
		this.nationalId = nationalId;
		this.nationalIdImage = nationalIdImage;
		this.nationality = nationality;
		this.guestProfileStatus = guestProfileStatus;
		this.remarks = remarks;
		this.isContract = isContract;
	}

	public GuestProfileVO() {
		super();

	}

	public GuestProfileVO(String createdBy, LocalDateTime createdOn, String modifiedBy, LocalDateTime modifiedOn) {
		super(createdBy, createdOn, modifiedBy, modifiedOn);

	}

}

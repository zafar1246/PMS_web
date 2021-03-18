package com.omaisss.pms.restentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address_master")

public class AddressMaster extends BaseEntity {

	@Id
	@Column(name = "address_master_id")
	private int addressMasterId;
	
	// NO foreign Key in Address_Master
	
	@Column(name="address_type_id")
	private int addressTypeId;

	@Column(name = "name")
	private String name;

	@Column(name = "designation")
	private int designation;

	@Column(name = "contact_no_1")
	private String contactNo1;

	@Column(name = "contact_no_2")
	private String contactNo2;

	@Column(name = "email")
	private String email;

	@Column(name = "address_1")
	private String address1;

	@Column(name = "address_2")
	private String address2;

	@Column(name = "area")
	private String area;

	@Column(name = "city")
	private int city;

	@Column(name = "district")
	private int district;

	@Column(name = "country")
	private int country;

	public int getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAddressMasterId() {
		return addressMasterId;
	}

	public void setAddressMasterId(int addressMasterId) {
		this.addressMasterId = addressMasterId;
	}

	public int getDesignation() {
		return designation;
	}

	public void setDesignation(int designation) {
		this.designation = designation;
	}

	public String getContactNo1() {
		return contactNo1;
	}

	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}

	public String getContactNo2() {
		return contactNo2;
	}

	public void setContactNo2(String contactNo2) {
		this.contactNo2 = contactNo2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public AddressMaster() {
	}

	public AddressMaster(int addressMasterId, int addressTypeId, String name, int designation, String contactNo1,
			String contactNo2, String email, String address1, String address2, String area, int city, int district,
			int country) {
		super();
		this.addressMasterId = addressMasterId;
		this.addressTypeId = addressTypeId;
		this.name = name;
		this.designation = designation;
		this.contactNo1 = contactNo1;
		this.contactNo2 = contactNo2;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.area = area;
		this.city = city;
		this.district = district;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address_Master [addressMasterId=" + addressMasterId + ", addressTypeId=" + addressTypeId + ", name="
				+ name + ", designation=" + designation + ", contactNo1=" + contactNo1 + ", contactNo2=" + contactNo2
				+ ", email=" + email + ", address1=" + address1 + ", address2=" + address2 + ", area=" + area
				+ ", city=" + city + ", district=" + district + ", country=" + country + "]";
	}

}
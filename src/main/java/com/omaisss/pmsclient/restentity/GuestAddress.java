package com.omaisss.pmsclient.restentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = " guest_address")
public class GuestAddress extends BaseEntity {
	
	//2 foreign Keys - AddressMaster and GuestProfile

	@Id
	@Column(name = "guest_address_id")
	private int guestAddressId;

	@Column(name = "guest_profile_id")
	private int guestProfileId;

	@Column(name = "address_type_id")
	private int addressTypeId;

	@Column(name = "address_master_id")
	private int addressMasterId;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "is_default")
	private Number isDefault;

	@Column(name = "is_active")
	private Number isActive;

	public int getGuestAddressId() {
		return guestAddressId;
	}

	public void setGuestAddressId(int guestAddressId) {
		this.guestAddressId = guestAddressId;
	}

	public int getGuestProfileId() {
		return guestProfileId;
	}

	public void setGuestProfileId(int guestProfileId) {
		this.guestProfileId = guestProfileId;
	}

	public int getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public int getAddressMasterId() {
		return addressMasterId;
	}

	public void setAddressMasterId(int addressMasterId) {
		this.addressMasterId = addressMasterId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Number getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(Number isDefault) {
		this.isDefault = isDefault;
	}

	public Number getIsActive() {
		return isActive;
	}

	public void setIsActive(Number isActive) {
		this.isActive = isActive;
	}

	public GuestAddress() {

	}

	public GuestAddress(int guestAddressId, int guestProfileId, int addressTypeId, int addressMasterId, String remarks,
			Number isDefault, Number isActive) {
	//	super();
		this.guestAddressId = guestAddressId;
		this.guestProfileId = guestProfileId;
		this.addressTypeId = addressTypeId;
		this.addressMasterId = addressMasterId;
		this.remarks = remarks;
		this.isDefault = isDefault;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "GuestAddress [guestAddressId=" + guestAddressId + ", guestProfileId=" + guestProfileId
				+ ", addressTypeId=" + addressTypeId + ", addressMasterId=" + addressMasterId + ", remarks=" + remarks
				+ ", isDefault=" + isDefault + ", isActive=" + isActive + "]";
	}

}

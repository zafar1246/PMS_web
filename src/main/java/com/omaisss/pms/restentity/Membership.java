package com.omaisss.pms.restentity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "membership")

public class Membership extends BaseEntity {

	@Id
	@Column(name = "membership_id")
	private int membershipId;
	
	// NO foreign Key in Membership

	@Column(name = "membership_type_id")
	private int membershipTypeId;

	@Column(name = "date_from")
	private Date dateFrom;

	@Column(name = "date_to")
	private Date dateTo;

	@Column(name = "is_active")
	private int isActive;

	@Column(name = "remarks")
	private String remarks;

	public int getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}

	public int getMembershipTypeId() {
		return membershipTypeId;
	}

	public void setMembershipTypeId(int membershipTypeId) {
		this.membershipTypeId = membershipTypeId;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Membership() {
	}

	public Membership(int membershipId, int membershipTypeId, Date dateFrom, Date dateTo, int isActive,
			String remarks) {
	//	super();
		this.membershipId = membershipId;
		this.membershipTypeId = membershipTypeId;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.isActive = isActive;
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "Membership [membershipId=" + membershipId + ", membershipTypeId=" + membershipTypeId + ", dateFrom="
				+ dateFrom + ", dateTo=" + dateTo + ", isActive=" + isActive + ", remarks=" + remarks + "]";
	}

}

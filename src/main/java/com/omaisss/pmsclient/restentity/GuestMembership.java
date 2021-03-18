package com.omaisss.pmsclient.restentity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_membership")
public class GuestMembership  extends BaseEntity{
	
	
	//2 foreign Keys GuestProfile and Membership

	@Id
	@Column(name = "guest_membership_id")
	private int guestMembershipId;

	@Column(name = "guest_profile_id")
	private int guestProfileId;

	@Column(name = "membership_id")
	private int membershipId;

	@Column(name = "date_from")
	private Date dateFrom;

	@Column(name = "date_to")
	private Date dateTo;

	@Column(name = "is_active")
	private int isActive;

	public int getGuestMembershipId() {
		return guestMembershipId;
	}

	public void setGuestMembershipId(int guestMembershipId) {
		this.guestMembershipId = guestMembershipId;
	}

	public int getGuestProfileId() {
		return guestProfileId;
	}

	public void setGuestProfileId(int guestProfileId) {
		this.guestProfileId = guestProfileId;
	}

	public int getMembershipId() {
		return membershipId;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
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

	public GuestMembership() {
	}

	public GuestMembership(int guestMembershipId, int guestProfileId, int membershipId, Date dateFrom, Date dateTo,
			int isActive) {
		super();
		this.guestMembershipId = guestMembershipId;
		this.guestProfileId = guestProfileId;
		this.membershipId = membershipId;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "GuestMembership [guestMembershipId=" + guestMembershipId + ", guestProfileId=" + guestProfileId
				+ ", membershipId=" + membershipId + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", isActive="
				+ isActive + "]";
	}

}

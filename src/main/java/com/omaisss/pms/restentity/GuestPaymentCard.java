package com.omaisss.pms.restentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_payment_card")

public class GuestPaymentCard extends BaseEntity {

	@Id
	@Column(name = "guest_payment_card_id")
	private int guestPaymentCardId;

	@Column(name = "guest_profile_id")
	private int guestProfileId;

	@Column(name = "payment_card_id")
	private int paymentCardId;

	@Column(name = "is_default")
	private int isDefault;

	@Column(name = "is_active")
	private int isActive;

	public int getGuestPaymentCardId() {
		return guestPaymentCardId;
	}

	public void setGuestPaymentCardId(int guestPaymentCardId) {
		this.guestPaymentCardId = guestPaymentCardId;
	}

	public int getGuestProfileId() {
		return guestProfileId;
	}

	public void setGuestProfileId(int guestProfileId) {
		this.guestProfileId = guestProfileId;
	}

	public int getPaymentCardId() {
		return paymentCardId;
	}

	public void setPaymentCardId(int paymentCardId) {
		this.paymentCardId = paymentCardId;
	}

	public int getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(int isDefault) {
		this.isDefault = isDefault;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public GuestPaymentCard() {
	}

	public GuestPaymentCard(int guestPaymentCardId, int guestProfileId, int paymentCardId, int isDefault,
			int isActive) {
		super();
		this.guestPaymentCardId = guestPaymentCardId;
		this.guestProfileId = guestProfileId;
		this.paymentCardId = paymentCardId;
		this.isDefault = isDefault;
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "GuestPaymentCard [guestPaymentCardId=" + guestPaymentCardId + ", guestProfileId=" + guestProfileId
				+ ", paymentCardId=" + paymentCardId + ", isDefault=" + isDefault + ", isActive=" + isActive + "]";
	}

}

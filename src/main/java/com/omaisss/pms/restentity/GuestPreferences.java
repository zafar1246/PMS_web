package com.omaisss.pms.restentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "guest_preferences")

public class GuestPreferences extends BaseEntity{

	@Id
	@Column(name = "guest_preferences_id")
	private int guestPreferencesId;

	@Column(name = "guest_profile_id")
	private int guestProfileId;

	@Column(name = "preference_id")
	private int preferenceId;

	@Column(name = "preference_value")
	private String preferenceValue;

	@Column(name = "remarks")
	private String remarks;

	public int getGuestPreferencesId() {
		return guestPreferencesId;
	}

	public void setGuestPreferencesId(int guestPreferencesId) {
		this.guestPreferencesId = guestPreferencesId;
	}

	public int getGuestProfileId() {
		return guestProfileId;
	}

	public void setGuestProfileId(int guestProfileId) {
		this.guestProfileId = guestProfileId;
	}

	public int getPreferenceId() {
		return preferenceId;
	}

	public void setPreferenceId(int preferenceId) {
		this.preferenceId = preferenceId;
	}

	public String getPreferenceValue() {
		return preferenceValue;
	}

	public void setPreferenceValue(String preferenceValue) {
		this.preferenceValue = preferenceValue;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public GuestPreferences() {
		super();
	}

	public GuestPreferences(int guestPreferencesId, int guestProfileId, int preferenceId, String preferenceValue,
			String remarks) {
		super();
		this.guestPreferencesId = guestPreferencesId;
		this.guestProfileId = guestProfileId;
		this.preferenceId = preferenceId;
		this.preferenceValue = preferenceValue;
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "GuestPreferences [guestPreferencesId=" + guestPreferencesId + ", guestProfileId=" + guestProfileId
				+ ", preferenceId=" + preferenceId + ", preferenceValue=" + preferenceValue + ", remarks=" + remarks
				+ "]";
	}

}

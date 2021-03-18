package com.omaisss.pmsclient.restentity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_USER_ROLE")
public class AppUserRole extends BaseEntity {

	@Id
	@Column(name = "APP_USER_ROLE_ID")
	private int appUserRoleId;

	@Column(name = "APP_USER_ID")
	private int appUserId;

	@Column(name = "APP_ROLE_ID")
	private int appRoleid;

	@Column(name = "IS_ACTIVE")
	private char isActive;

	public int getAppUserRoleId() {
		return appUserRoleId;
	}

	public void setAppUserRoleId(int appUserRoleId) {
		this.appUserRoleId = appUserRoleId;
	}

	public int getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(int appUserId) {
		this.appUserId = appUserId;
	}

	public int getAppRoleid() {
		return appRoleid;
	}

	public void setAppRoleid(int appRoleid) {
		this.appRoleid = appRoleid;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public AppUserRole(String createdBy, Date createdOn, String modifiedBy, Date modifiedOn, int appUserRoleId,
			int appUserId, int appRoleid, char isActive) {
		
		this.appUserRoleId = appUserRoleId;
		this.appUserId = appUserId;
		this.appRoleid = appRoleid;
		this.isActive = isActive;
	}

	public AppUserRole() {

	}

}

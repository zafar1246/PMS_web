package com.omaisss.pms.restentity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "APP_USER")
public class AppUser extends BaseEntity {
	
	@OneToMany
	List<AppRole> roles;

	@Id
	@Column(name = "APP_USER_ID")
	private int appUserid;

	@Column(name = "APP_MASTER_ID")
	private int appMasterId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "FULL_NAME")
	private String fullName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "EMAIL_CONFIRMED")
	private char emailConfirmed;

	@Column(name = "PASSWORD_HASH")
	private String passwordHash;

	@Column(name = "SECURITY_STAMP")
	private String securityStamp;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "PHONE_NUMBER_CONFIRMED")
	private char phoneNumberConfirmed;

	@Column(name = "TWO_FACTOR_ENABLED")
	private char twoFactorEnabled;

	@Column(name = "LOCKOUT_END_DATE_UTC")
	private Date lockOutEndDateUtc;

	@Column(name = "LOCKOUT_ENABLED")
	private char lockOutEnabled;

	@Column(name = "ACCESS_FAILED_COUNT")
	private int accessFailedCount;

	@Column(name = "IS_ACTIVE")
	private char isActive;

	public int getAppUserid() {
		return appUserid;
	}

	public void setAppUserid(int appUserid) {
		this.appUserid = appUserid;
	}

	public int getAppMasterId() {
		return appMasterId;
	}

	public void setAppMasterId(int appMasterId) {
		this.appMasterId = appMasterId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getEmailConfirmed() {
		return emailConfirmed;
	}

	public void setEmailConfirmed(char emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getSecurityStamp() {
		return securityStamp;
	}

	public void setSecurityStamp(String securityStamp) {
		this.securityStamp = securityStamp;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public char getPhoneNumberConfirmed() {
		return phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(char phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public char getTwoFactorEnabled() {
		return twoFactorEnabled;
	}

	public void setTwoFactorEnabled(char twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public Date getLockOutEndDateUtc() {
		return lockOutEndDateUtc;
	}

	public void setLockOutEndDateUtc(Date lockOutEndDateUtc) {
		this.lockOutEndDateUtc = lockOutEndDateUtc;
	}

	public char getLockOutEnabled() {
		return lockOutEnabled;
	}

	public void setLockOutEnabled(char lockOutEnabled) {
		this.lockOutEnabled = lockOutEnabled;
	}

	public int getAccessFailedCount() {
		return accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public AppUser() {

	}

	public AppUser(int appUserid, int appMasterId, String userName, String fullName, String email, char emailConfirmed,
			String passwordHash, String securityStamp, String phoneNumber, char phoneNumberConfirmed,
			char twoFactorEnabled, Date lockOutEndDateUtc, char lockOutEnabled, int accessFailedCount, char isActive) {
		super();
		this.appUserid = appUserid;
		this.appMasterId = appMasterId;
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		this.emailConfirmed = emailConfirmed;
		this.passwordHash = passwordHash;
		this.securityStamp = securityStamp;
		this.phoneNumber = phoneNumber;
		this.phoneNumberConfirmed = phoneNumberConfirmed;
		this.twoFactorEnabled = twoFactorEnabled;
		this.lockOutEndDateUtc = lockOutEndDateUtc;
		this.lockOutEnabled = lockOutEnabled;
		this.accessFailedCount = accessFailedCount;
		this.isActive = isActive;
	}

	
	public List<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(List<AppRole> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "AppUser [appUserid=" + appUserid + ", appMasterId=" + appMasterId + ", userName=" + userName
				+ ", fullName=" + fullName + ", email=" + email + ", emailConfirmed=" + emailConfirmed
				+ ", passwordHash=" + passwordHash + ", securityStamp=" + securityStamp + ", phoneNumber=" + phoneNumber
				+ ", phoneNumberConfirmed=" + phoneNumberConfirmed + ", twoFactorEnabled=" + twoFactorEnabled
				+ ", lockOutEndDateUtc=" + lockOutEndDateUtc + ", lockOutEnabled=" + lockOutEnabled
				+ ", accessFailedCount=" + accessFailedCount + ", isActive=" + isActive + "]";
	}



}

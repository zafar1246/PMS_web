package com.omaisss.pmsclient.restentity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="APP_ROLE")
public class AppRole extends BaseEntity {

	@Id
	@Column(name="APP_ROLE_ID")
	private int appRoleId;
	
	@Column(name="PARENT_ID")
	private int parentId;
	
	@Column(name="ROLE_NAME")
	private String roleName;
	
	@Column(name="ROLE_NAME_1")
	private String roleName1;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="IS_ACTIVE")
	private char isActive;

	public int getAppRoleId() {
		return appRoleId;
	}

	public void setAppRoleId(int appRoleId) {
		this.appRoleId = appRoleId;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName1() {
		return roleName1;
	}

	public void setRoleName1(String roleName1) {
		this.roleName1 = roleName1;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getIsActive() {
		return isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	public AppRole(int appRoleId, int parentId, String roleName, String roleName1, String description, char isActive) {
		super();
		this.appRoleId = appRoleId;
		this.parentId = parentId;
		this.roleName = roleName;
		this.roleName1 = roleName1;
		this.description = description;
		this.isActive = isActive;
	}

	public AppRole() {
		
	}

	@Override
	public String toString() {
		return "AppRole [appRoleId=" + appRoleId + ", parentId=" + parentId + ", roleName=" + roleName + ", roleName1="
				+ roleName1 + ", description=" + description + ", isActive=" + isActive + "]";
	}

	
	
	
	
	
	
	
}

package com.omaisss.pms.restdomainobjects;

import java.time.LocalDateTime;

public class BaseVO {

	private String createdBy;
	private LocalDateTime createdOn;
	private String modifiedBy;
	private LocalDateTime modifiedOn;

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public LocalDateTime getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(LocalDateTime modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public BaseVO() {
		super();
	}

	public BaseVO(String createdBy, LocalDateTime createdOn, String modifiedBy, LocalDateTime modifiedOn) {
		super();
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.modifiedBy = modifiedBy;
		this.modifiedOn = modifiedOn;
	}

	@Override
	public String toString() {
		return "BaseVO [createdBy=" + createdBy + ", createdOn=" + createdOn + ", modifiedBy=" + modifiedBy
				+ ", modifiedOn=" + modifiedOn + "]";
	}

}

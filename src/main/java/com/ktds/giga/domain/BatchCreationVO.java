package com.ktds.giga.domain;

public class BatchCreationVO {
	private String trackerId;		//이슈 종류
	private String projectId;		//프로젝트 아이디
	private String subject;			//제목
	private String statusId;		//상태 아이디
	private String priorityId;		//우선순위
	private String authorId;		//생성자 아이디
	private String lockVersion;	//
	private String doneRatio;		//
	private String isPrivate;		//
	
	public String getTrackerId() {
		return trackerId;
	}
	public void setTrackerId(String trackerId) {
		this.trackerId = trackerId;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getPriorityId() {
		return priorityId;
	}
	public void setPriorityId(String priorityId) {
		this.priorityId = priorityId;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}
	public String getLockVersion() {
		return lockVersion;
	}
	public void setLockVersion(String lockVersion) {
		this.lockVersion = lockVersion;
	}
	public String getDoneRatio() {
		return doneRatio;
	}
	public void setDoneRatio(String doneRatio) {
		this.doneRatio = doneRatio;
	}
	public String getIsPrivate() {
		return isPrivate;
	}
	public void setIsPrivate(String isPrivate) {
		this.isPrivate = isPrivate;
	}
	
	
	
	
	
}

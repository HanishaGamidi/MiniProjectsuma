package com.cg.project.dto;

import java.util.Date;

public class Applicant {
	private int applicationid;
	 private String fullname; 
	 private Date dateofbirth;
	 private String highestqualification;
	 private int marksobtained;
	 private String goals;
	 private String email;
	 private String scheduledprogramid;
	 private String status ;
	 private Date dateofinterview;
	public int getApplicationid() {
		return applicationid;
	}
	
	
	public Applicant( String fullname, Date dateofbirth, String highestqualification,
			int marksobtained, String goals, String email, String scheduledprogramid, String status,
			Date dateofinterview) {
		super();
		//this.applicationid = applicationid;
		this.fullname = fullname;
		this.dateofbirth = dateofbirth;
		this.highestqualification = highestqualification;
		this.marksobtained = marksobtained;
		this.goals = goals;
		this.email = email;
		this.scheduledprogramid = scheduledprogramid;
		this.status = status;
		this.dateofinterview = dateofinterview;
	}


	public void setApplicationid(int applicationid) {
		this.applicationid = applicationid;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getHighestqualification() {
		return highestqualification;
	}
	public void setHighestqualification(String highestqualification) {
		this.highestqualification = highestqualification;
	}
	public int getMarksobtained() {
		return marksobtained;
	}
	public void setMarksobtained(int marksobtained) {
		this.marksobtained = marksobtained;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getScheduledprogramid() {
		return scheduledprogramid;
	}
	public void setScheduledprogramid(String scheduledprogramid) {
		this.scheduledprogramid = scheduledprogramid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateofinterview() {
		return dateofinterview;
	}
	public void setDateofinterview(Date dateofinterview) {
		this.dateofinterview = dateofinterview;
	}
	 
	 
	 

}

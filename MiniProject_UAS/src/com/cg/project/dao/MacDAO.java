package com.cg.project.dao;

import com.cg.project.dto.Applicant;
import com.cg.project.exception.UASException;

//import com.cg.project.dto.Applicant;

public interface MacDAO {

//	public boolean loginverification (String login_id,String user_password) throws UASException;
	public void applicationstatus(int applicationid) throws UASException;
	public void updateapplicationstatus(int applicantionid ,String status) throws UASException;
	public void retrieveapplications(String scheduledprogramid) throws UASException;
	public boolean createapplicant(Applicant appl) throws UASException;
	
	
	
}

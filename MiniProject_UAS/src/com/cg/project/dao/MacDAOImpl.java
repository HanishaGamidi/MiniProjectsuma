package com.cg.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.log4j.Logger;

import com.cg.project.dto.Applicant;
import com.cg.project.exception.UASException;
import com.cg.project.utils.DBUtils;
import com.cg.project.utils.Log4jHTMLLayout;

public class MacDAOImpl implements MacDAO {
   
private static Logger log = Logger.getLogger(Log4jHTMLLayout.class);
	
	
	private Connection dbConnection; 

	{
		try {
			dbConnection = DBUtils.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	@Override
	public boolean loginverification(String login_id, String user_password) throws UASException {
       String loginQuery = "select user_password from Users where login_id=?";
		
		try {
			PreparedStatement insertStatement = dbConnection.prepareStatement(loginQuery);
			
			
			insertStatement.setString(1, login_id);
			ResultSet result = insertStatement.executeQuery();
			
			String password=result.getString(2);
			
			if(password.equals(user_password))
			{
				System.out.println("Valid user..");
				log.info("Valid user..");
				return true;
			}
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw new UASException("Login failed...",e);
//			return false;
		}
	}

	
	*/
	@Override
	public void applicationstatus(int applicationid) throws UASException {
         String selectquery=" select status from applicant where applicationid=?";
         try{
        	 PreparedStatement selectstatement= dbConnection.prepareStatement(selectquery);
        	 selectstatement.setInt(1, applicationid);
        	
        	 ResultSet result=  selectstatement.executeQuery();
        	 String status= result.getString(9);
        	 System.out.println("\n Status of "+ applicationid+ "is "+status);
        	 
         }catch (SQLException e) {
 			e.printStackTrace();
 			log.error(e.getMessage());
 			throw new UASException("Unable to fetch status of the applicant...",e);
 			
 		}
	}

	@Override
	public void retrieveapplications(String scheduledprogramid) throws UASException {
           String selectquery= " select * from applicant where scheduledprogramid=?";
           
           try{
           	PreparedStatement selectstatement= dbConnection.prepareStatement(selectquery);
           	selectstatement.setString(1, scheduledprogramid);
           	
           	ResultSet result= selectstatement.executeQuery();
           	while(result.next()){
           		String applicationid= result.getString(1);
           		String fullname= result.getString(2);
           		Date dob= result.getDate(3);
           		String qualification= result.getString(4);
           		int marks= result.getInt(5);
           		String goals= result.getString(6);
           		String email= result.getString(7);
           		String schprogid= result.getString(8);
           		String appstatus= result.getString(9);
           		Date doi= result.getDate(10);
           		System.out.println("\n ApplicationId: "+ applicationid);
           		System.out.println("\n Fullname: "+ fullname);
           		System.out.println("\n Date Of Birth: "+ dob);
           		System.out.println("\n qualification: "+ qualification);
           		System.out.println("\n Marks Obtained: "+ marks);
           		System.out.println("\n Goals: "+ goals);
           		System.out.println("\n Email: "+ email);
           		System.out.println("\n Scheduled Program Id: "+ schprogid);
           		System.out.println("\n Status: "+ appstatus);

           		System.out.println("\n Date Of Interview: "+ doi);


           	}
           	
           	}catch (SQLException e) {
       			e.printStackTrace();
       			log.error(e.getMessage());
       			throw new UASException("Retrieval of application failed...",e);
       		
               	
               }
	}

	@Override
	public boolean createapplicant(Applicant appl) throws UASException {
String insertquery= " insert into applicant values(application_id_seq.nextval(),?,?,?,?,?,?,?,?,?) ";
		
		
		try {
			PreparedStatement insertStatement = dbConnection.prepareStatement(insertquery);
			

			insertStatement.setInt(1, appl.getApplicationid());
			insertStatement.setString(2, appl.getFullname());
			
			
			Date dob = new Date(appl.getDateofbirth().getTime());
			
			insertStatement.setDate(3, (java.sql.Date)dob);
			insertStatement.setString(4, appl.getHighestqualification());
			insertStatement.setInt(5, appl.getMarksobtained());
			insertStatement.setString(6, appl.getGoals());
			insertStatement.setString(7, appl.getEmail());
			insertStatement.setString(8, appl.getScheduledprogramid());
			insertStatement.setString(9, appl.getStatus());
			
			Date doi = new Date(appl.getDateofinterview().getTime());
			
			insertStatement.setDate(10, (java.sql.Date)doi);
			
			
			int rows = insertStatement.executeUpdate();
			
			if((rows > 0))
			{
				System.out.println("Applicant added succesfully...");
				log.info("Added a row in db now...");
				return true;
			}
				
				
			else 
				return false;
			
		} catch (SQLException e) {
			e.printStackTrace();
			log.error(e.getMessage());
			throw new UASException("Failed to create application...",e);
//			return false;
		}
	

	}

	@Override
	public void updateapplicationstatus(int applicantid,String status) throws UASException {
      String updatequery="update applicant set status=? where applicationid=?";
      try{
			PreparedStatement updatestatement= dbConnection.prepareStatement(updatequery);
			updatestatement.setString(1, status);
			updatestatement.setInt(2, applicantid);
			updatestatement.executeQuery();
      }catch (SQLException e) {
			e.printStackTrace();
			log.error(e.getMessage());
      }	
	
	}
}

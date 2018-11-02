package com.cg.project.dto;

public class ProgramsOffered {

	private String ProgramName;
	private String description;
	private String applicant_eligibility;
	private String degree_certificate_offered;
	private int program_duration;
	public String getProgramName() {
		return ProgramName;
	}
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getApplicant_eligibility() {
		return applicant_eligibility;
	}
	public void setApplicant_eligibility(String applicant_eligibility) {
		this.applicant_eligibility = applicant_eligibility;
	}
	public String getDegree_certificate_offered() {
		return degree_certificate_offered;
	}
	public void setDegree_certificate_offered(String degree_certificate_offered) {
		this.degree_certificate_offered = degree_certificate_offered;
	}
	public int getProgram_duration() {
		return program_duration;
	}
	public void setProgram_duration(int program_duration) {
		this.program_duration = program_duration;
	}
	
	
	
	
}

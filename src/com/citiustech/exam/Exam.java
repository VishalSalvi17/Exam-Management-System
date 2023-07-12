package com.citiustech.exam;

public class Exam {
	private int examID;
    private String examName;
    private String createdBy;
    private String subject;
    private String description;
    
	public Exam(int examID, String examName, String createdBy, String subject, String description) {
		super();
		this.examID = examID;
		this.examName = examName;
		this.createdBy = createdBy;
		this.subject = subject;
		this.description = description;
	}

	public Exam(String examName, String createdBy, String subject, String description) {
		super();
		this.examName = examName;
		this.createdBy = createdBy;
		this.subject = subject;
		this.description = description;
	}

	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getExamID() {
		return examID;
	}

	public void setExamID(int examID) {
		this.examID = examID;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreated_by(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Exam [examID=" + examID + ", examName=" + examName + ", createdBy=" + createdBy + ", subject="
				+ subject + ", description=" + description + "]";
	}
}

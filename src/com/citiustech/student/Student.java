package com.citiustech.student;

public class Student {
	 private int studentRollNumber;
	 private String studentFirstName;
	 private String studentLastName;
	 private String studentGender;
	 private String studentPassword;
	 private String studentAddress;
	 private String studentEmail;
	 private String studentCourse;
	 
	public Student(int studentRollNumber, String studentFirstName, String studentLastName, String studentGender,
			String studentPassword, String studentAddress, String studentEmail, String studentCourse) {
		super();
		this.studentRollNumber = studentRollNumber;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentGender = studentGender;
		this.studentPassword = studentPassword;
		this.studentAddress = studentAddress;
		this.studentEmail = studentEmail;
		this.studentCourse = studentCourse;
	}

	public Student(String studentFirstName, String studentLastName, String studentGender, String studentPassword,
			String studentAddress, String studentEmail, String studentCourse) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentGender = studentGender;
		this.studentPassword = studentPassword;
		this.studentAddress = studentAddress;
		this.studentEmail = studentEmail;
		this.studentCourse = studentCourse;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentPassword() {
		return studentPassword;
	}

	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	@Override
	public String toString() {
		return "Student [studentRollNumber=" + studentRollNumber + ", studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentGender=" + studentGender + ", studentPassword="
				+ studentPassword + ", studentAddress=" + studentAddress + ", studentEmail=" + studentEmail
				+ ", studentCourse=" + studentCourse + "]";
	}
}

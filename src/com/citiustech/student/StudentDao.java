package com.citiustech.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class StudentDao {

	public static boolean insertStudentToDatabase(Student student) {

		boolean f = false;

		try {
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String query = "insert into Student(studentFirstName, studentLastName, studentGender, studentPassword, studentAddress, studentEmail, studentCourse) values(?,?,?,?,?,?,?)";

			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(query);

			// set the value of parameters
			pstmt.setString(1, student.getStudentFirstName());
			pstmt.setString(2, student.getStudentLastName());
			pstmt.setString(3, student.getStudentGender());
			pstmt.setString(4, student.getStudentPassword());
			pstmt.setString(5, student.getStudentAddress());
			pstmt.setString(6, student.getStudentEmail());
			pstmt.setString(7, student.getStudentCourse());

			// execute
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteStudent(int studentRollNumber) {

		boolean f = false;

		try {
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String query = "delete from Student where studentRollNumber = ?";

			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(query);

			// set the value of parameters
			pstmt.setInt(1, studentRollNumber);

			// execute
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;

	}

	public static void showAllStudents() {
		// TODO Auto-generated method stub
		boolean f = false;

		try {
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String query = "select * from Student";

			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(query);
			while(set.next()){
				int studentRollNumber = set.getInt(1);
				String studentFirstName = set.getString(2);
				String studentLastName = set.getString(3);
				String studentGender = set.getString(4);
				String studentPassword = set.getString(5);
				String studentAddress = set.getString(6);
				String studentEmail = set.getString(7);
				String studentCourse = set.getString(8);
				
				System.out.println("studentRollNumber : "+studentRollNumber);
				System.out.println("studentFirstName : "+studentFirstName);
				System.out.println("studentLastName : "+studentLastName);
				System.out.println("studentGender : "+studentGender);
				System.out.println("studentPassword : "+studentPassword);
				System.out.println("studentAddress : "+studentAddress);
				System.out.println("studentEmail : "+studentEmail);
				System.out.println("studentCourse : "+studentCourse);
				System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			}
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

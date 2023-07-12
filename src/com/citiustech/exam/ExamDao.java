package com.citiustech.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.citiustech.student.ConnectionProvider;

public class ExamDao {

	public static boolean createExam(Exam exam) {
		// TODO Auto-generated method stub
		boolean f = false;
		try {
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();

			String query = "insert into exam(examName, createdBy, subject, description) values(?,?,?,?)";

			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, exam.getExamName());
			pstmt.setString(2, exam.getCreatedBy());
			pstmt.setString(3, exam.getSubject());
			pstmt.setString(4, exam.getDescription());

			// execute
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean deleteExam(int examID) {
		// TODO Auto-generated method stub
		boolean f = false;

		try {
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String query = "delete from exam where examID = ?";

			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(query);

			// set the value of parameters
			pstmt.setInt(1, examID);

			// execute
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

	public static boolean updateExam(int examID1, String examName1, String createdBy1, String subject1,
			String description1) {
		// TODO Auto-generated method stub
		boolean f1 = false;
		try {
			Connection con = ConnectionProvider.createConnection();
			String updateExamQuery = "update exam SET examName = ?, createdBy = ?, subject = ?, description = ? WHERE examID = ?";

			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(updateExamQuery);

			// set the value of parameters
			pstmt.setString(1, examName1);
			pstmt.setString(2, createdBy1);
			pstmt.setString(3, subject1);
			pstmt.setString(4, description1);
			pstmt.setInt(5, examID1);
			;

			// execute
			pstmt.executeUpdate();

			f1 = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public static void showAllExams() {
		// TODO Auto-generated method stub
		boolean f = false;

		try {
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String query = "select * from exam";

			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(query);
			while (set.next()) {
				int examID = set.getInt(1);
				String examName = set.getString(2);
				String createdBy = set.getString(3);
				String subject = set.getString(4);
				String description = set.getString(5);

				System.out.println("examID : " + examID);
				System.out.println("examName : " + examName);
				System.out.println("createdBy : " + createdBy);
				System.out.println("subject : " + subject);
				System.out.println("description : " + description);

				System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			}
			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static boolean getExamById(int thisExmId) {
		// TODO Auto-generated method stub
		boolean getExamById = false;
		try {
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String getExamByIdQuery = "select examID, examName, createdBy, subject, description  from exam where examID = '"+thisExmId+"' ";

			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(getExamByIdQuery);

			while (set.next()) {
				int examID = set.getInt(1);
				String examName = set.getString(2);
				String createdBy = set.getString(3);
				String subject = set.getString(4);
				String description = set.getString(5);

				System.out.println("examID : " + examID);
				System.out.println("examName : " + examName);
				System.out.println("createdBy : " + createdBy);
				System.out.println("subject : " + subject);
				System.out.println("description : " + description);

				System.out.println("++++++++++++++++++++++++++++++++++++++++++");
			}
			getExamById = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}

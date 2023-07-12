package com.citiustech.questions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.citiustech.student.ConnectionProvider;

public class QuestionsDao {

	public static boolean insertQuestions(Questions questions) {
		// TODO Auto-generated method stub
		boolean addQuestions = false;
		try{
			Connection con = ConnectionProvider.createConnection();
			String query = "insert into questions (questionId, question, examId, opt1, opt2, opt3, correctAns) values(?,?,?,?,?,?,?)";
			
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setInt(1, questions.getQuestionId());
			pstmt.setString(2, questions.getQuestion());
			pstmt.setInt(3, questions.getExamID());
			pstmt.setString(4, questions.getOpt1());
			pstmt.setString(5, questions.getOpt2());
			pstmt.setString(6, questions.getOpt3());
			pstmt.setString(7, questions.getCorrectAns());
			
			// execute
			pstmt.executeUpdate();
			addQuestions = true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return addQuestions;
	}

	public static boolean updateQuestion(int queId, int questId, String questn, int exmId, String option1, String option2,
			String option3, String corrtAns) {
		// TODO Auto-generated method stub
		
		boolean updateQuestion = false;
		
		try{
			Connection con = ConnectionProvider.createConnection();
			String updateExamQuery = " update questions SET questionId = ?, question = ?, examID = ?, opt1 = ?, opt2 = ?, opt3 = ?, correctAns = ? where questionId = ? "; 
			
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(updateExamQuery);
			
			pstmt.setInt(1, questId);
			pstmt.setString(2, questn);
			pstmt.setInt(3, exmId);
			pstmt.setString(4,option1);
			pstmt.setString(5, option2);
			pstmt.setString(6, option3);
			pstmt.setString(7, corrtAns);
			pstmt.setInt(8, queId);
			
			// execute
			pstmt.executeUpdate();
			
			updateQuestion=true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public static boolean deleteQuestion(int quesId) {
		// TODO Auto-generated method stub
		boolean deleteQuestion = false;
		
		try{
			
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String deleteQuestionQuery = "delete from questions where questionId = ?";
			
			// prepared statement
			PreparedStatement pstmt = con.prepareStatement(deleteQuestionQuery);
			
			// set the value of parameters
			pstmt.setInt(1, quesId);
			
			// execute
			pstmt.executeUpdate();
			
			deleteQuestion=true;
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return deleteQuestion;
	}

	public static void displayAllQuesions() {
		// TODO Auto-generated method stub
		boolean displayAllQuestions = false;
		
		try{
			// jdbc code..
			Connection con = ConnectionProvider.createConnection();
			String displayAllQuestionsQuery = "select * from questions";
			
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(displayAllQuestionsQuery);
			
			while(set.next()){
				int questionId = set.getInt(1);
				String question = set.getString(2);
				String examID = set.getString(3);
				String opt1 = set.getString(4);
				String opt2 = set.getString(5);
				String opt3 = set.getString(6);
				String correctAns = set.getString(7);
				
				System.out.println("questionId : "+questionId);
				System.out.println("question : "+question);
				System.out.println("examID : "+examID);
				System.out.println("opt1 : "+opt1);
				System.out.println("opt2 : "+opt2);
				System.out.println("opt3 : "+opt3);
				System.out.println("correctAns : "+correctAns);
			}
			
			displayAllQuestions = true;
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

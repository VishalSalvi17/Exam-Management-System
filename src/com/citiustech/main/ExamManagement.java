package com.citiustech.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.citiustech.student.Student;
import com.citiustech.student.StudentDao;

public class ExamManagement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to exam management system");
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in)); 
		
		while(true){
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to Display student");
			System.out.println("Press 4 to Exit student");
			
			int c = Integer.parseInt(br.readLine());
			
			if(c==1){
				//add student
//				 private String studentFirstName;
				System.out.println("Enter Student First Name : ");
				String studentFirstName = br.readLine();
				
//				 private String studentLastName;
				System.out.println("Enter Student Last Name : ");
				String studentLastName = br.readLine();
				
//				 private String studentGender;
				System.out.println("Enter Student Gender : ");
				String studentGender = br.readLine();
				
//				 private String studentPassword;
				System.out.println("Enter Student Password : ");
				String studentPassword = br.readLine();
				
//				 private String studentAddress;
				System.out.println("Enter Student Address : ");
				String studentAddress = br.readLine();
				
//				 private String studentEmail;
				System.out.println("Enter Student Email : ");
				String studentEmail = br.readLine();
				
//				 private String studentCourse;
				System.out.println("Enter Student Course : ");
				String studentCourse = br.readLine();
				
				//create student object to store student
				Student student = new Student(studentFirstName, studentLastName, studentGender,
						studentPassword, studentAddress, studentEmail, studentCourse);
				
				boolean answer = StudentDao.insertStudentToDatabase(student);
				
				if(answer){
					System.out.println("Student is added successfully.....!");
				}else{
					System.out.println("Something went wrong!! Try again... ");
				}
				
				System.out.println(student);
				
			}else if(c==2){
				//delete student
				System.out.println("Enter student id to delete : ");
				int studentRollNumber = Integer.parseInt(br.readLine());
				boolean answer = StudentDao.deleteStudent(studentRollNumber);
				if(answer){
					System.out.println("Student Data Deleted successfully .....!");
				}else{
					System.out.println("Something went wrong!! Try again... ");
				}
				
			}else if(c==3){
				//display students
				StudentDao.showAllStudents();
			}else if(c==4){
				//exit
				break;
			}else{
				
			}
			System.out.println("Thank you for visist!!!");
			System.out.println("See you .. Bye Bye");
			System.out.println("==================================");
		}
	}

}

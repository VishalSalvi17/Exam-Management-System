package com.citiustech.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.citiustech.exam.Exam;
import com.citiustech.exam.ExamDao;
import com.citiustech.questions.Questions;
import com.citiustech.questions.QuestionsDao;
import com.citiustech.student.Student;
import com.citiustech.student.StudentDao;
import com.citiustech.test.TestDao;

public class ExamManagement {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int mainChoice;

		System.out.println("Welcome to exam management system");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("-----------------Please Select Your Role-----------");
			System.out.println("1. Admin");
			System.out.println("2. Student");
			System.out.println("0. Exit");
			System.out.println("------------------------------------------------------------");
			System.out.print("Enter Your choice: ");
			mainChoice = scanner.nextInt();
			System.out.println("------------------------------------------------------------");

			switch (mainChoice) {
			case 1:
				int adminChoice;
				do {
					System.out.println("----------------Admin Operation------------");
					System.out.println("1. Create Exam");
					System.out.println("2. Delete Exam");
					System.out.println("3. Update Exam");
					System.out.println("4. Get all Exam");
					System.out.println("5. Get Exam by ID");
					System.out.println("6. Add student");
					System.out.println("7. Delete Student");
					System.out.println("8. Update student");
					System.out.println("9. Get All students List");
					System.out.println("10. Get student by Roll Number");
					System.out.println("11. Get Consolidated Students Report card");
					System.out.println("12. Get Single student report card by ID");
					System.out.println("13. Add Question in Exam");
					System.out.println("14. Update Question in Exam");
					System.out.println("15. Delete Question from exam");
					System.out.println("16. Display all Questions from Exam.");
					System.out.println("0. Exit");
					System.out.println("------------------------------------------------------------");
					System.out.print("Enter Your choice: ");
					adminChoice = scanner.nextInt();
					System.out.println("------------------------------------------------------------");

					// Perform admin operations based on the choice

					switch (adminChoice) {
					case 1:
						System.out.println("Creating Exam...");
						
						// Perform create exam operation
						System.out.println("Enter name of the Exam : ");
						String examName = br.readLine();
						
						System.out.println("Enter name of the Exam creator : ");
						String createdBy = br.readLine();
						
						System.out.println("Enter Subject of exam : ");
						String subject = br.readLine();
						
						System.out.println("Enter Description of exam : ");
						String description = br.readLine();
						
						//create exam object
						Exam exam = new Exam(examName,createdBy,subject,description);
						
						boolean createExam = ExamDao.createExam(exam);
						
						if (createExam) {
							System.out.println("Exam is created successfully.....!");
						} else {
							System.out.println("Something went wrong!! Try again... ");
						}
						
						break;
						
					case 2:
						System.out.println("Deleting Exam...");
						
						// Perform delete exam operation
						System.out.println("Enter Exam ID to delete : ");
						int examID = Integer.parseInt(br.readLine());
						
						boolean deleteExam = ExamDao.deleteExam(examID);
						
						if(deleteExam){
							System.out.println("Exam deleted Successfully!...");
						}else{
							System.out.println("Something went wrong!! Try again... ");
						}
						break;
						
					case 3:
						System.out.println("Updating Exam...");
						
						// Perform update exam operation
						boolean f1;
						
						System.out.println("Enter Exam ID to update the exam");
						int examID1 = Integer.parseInt(br.readLine());
						
						System.out.println("Enter name of the Exam : ");
						String examName1 = br.readLine();
						
						System.out.println("Enter name of the Exam creator : ");
						String createdBy1 = br.readLine();
						
						System.out.println("Enter Subject of exam : ");
						String subject1 = br.readLine();
						
						System.out.println("Enter Description of exam : ");
						String description1 = br.readLine();
						
						ExamDao.updateExam(examID1,examName1,createdBy1,subject1,description1);
						
						if(f1=true){
							System.out.println("Exam Updated Successfully!....");
						}else{
							System.out.println("Something went wrong!! Try again... ");
						}
						break;
						
					case 4:
						System.out.println("Getting all Exams...");
						
						// Perform get all exams operation
						ExamDao.showAllExams();
						
						break;
						
					case 5:
						System.out.println("Getting Exam by ID...");
						
						// Perform get exam by ID operation
						System.out.println("Enter Exam ID to get Exam : ");
						int thisExmId = scanner.nextInt();
						
						boolean getExamById = ExamDao.getExamById(thisExmId);
						
						if(getExamById){
							System.out.println("Exam Data by Id Fetched successfully .....!");
						}else{
							System.out.println("Something went wrong!! Try again... ");
						}
						break;
						
					case 6:
						System.out.println("Adding Student...");
						
						// Perform add student operation
						// add student
						// private String studentFirstName;
						System.out.println("Enter Student First Name : ");
						String studentFirstName = br.readLine();

						// private String studentLastName;
						System.out.println("Enter Student Last Name : ");
						String studentLastName = br.readLine();

						// private String studentGender;
						System.out.println("Enter Student Gender : ");
						String studentGender = br.readLine();

						// private String studentPassword;
						System.out.println("Enter Student Password : ");
						String studentPassword = br.readLine();

						// private String studentAddress;
						System.out.println("Enter Student Address : ");
						String studentAddress = br.readLine();

						// private String studentEmail;
						System.out.println("Enter Student Email : ");
						String studentEmail = br.readLine();

						// private String studentCourse;
						System.out.println("Enter Student Course : ");
						String studentCourse = br.readLine();

						// create student object to store student
						Student student = new Student(studentFirstName, studentLastName, studentGender, studentPassword,
								studentAddress, studentEmail, studentCourse);

						boolean answer = StudentDao.insertStudentToDatabase(student);

						if (answer) {
							System.out.println("Student is added successfully.....!");
						} else {
							System.out.println("Something went wrong!! Try again... ");
						}

						System.out.println(student);
						
						break;

					case 7:
						System.out.println("Deleting Student...");
						
						// Perform delete student operation
						// delete student
						System.out.println("Enter student id to delete : ");
						int studentRollNumber = Integer.parseInt(br.readLine());
						
						boolean answerdel = StudentDao.deleteStudent(studentRollNumber);
						
						if (answerdel) {
							System.out.println("Student Data Deleted successfully .....!");
						} else {
							System.out.println("Something went wrong!! Try again... ");
						}
						break;

					case 8:
						System.out.println("Updating Student...");
						
						// Perform update student operation
						boolean f;
						
						System.out.println("Enter Student Roll No to update : ");
						int stRollNo = Integer.parseInt(br.readLine());
						
						System.out.println("Enter Student First Name : ");
						String stFirstName = br.readLine();

						// private String studentLastName;
						System.out.println("Enter Student Last Name : ");
						String stLastName = br.readLine();

						// private String studentGender;
						System.out.println("Enter Student Gender : ");
						String stGender = br.readLine();

						// private String studentPassword;
						System.out.println("Enter Student Password : ");
						String stPassword = br.readLine();

						// private String studentAddress;
						System.out.println("Enter Student Address : ");
						String stAddress = br.readLine();

						// private String studentEmail;
						System.out.println("Enter Student Email : ");
						String stEmail = br.readLine();

						// private String studentCourse;
						System.out.println("Enter Student Course : ");
						String stCourse = br.readLine();
						
						StudentDao.updateStudent(stRollNo,stFirstName,stLastName,stGender,stPassword,stAddress,stEmail,stCourse);
		
						if(f=true){
							System.out.println("Student Updated Successfully!....");
						}else{
							System.out.println("Something went wrong!! Try again... ");
						}
						
						break;
						
					case 9:
						System.out.println("Getting all Students List...");
						
						// Perform get all students list operation
						// display students
						StudentDao.showAllStudents();
						
						break;
						
					case 10:
						System.out.println("Getting Student by Roll Number...");
						
						// Perform get student by roll number operation
						System.out.println("Enter Student roll no : ");
						int stdRollNo = scanner.nextInt();
						
						boolean getStudentByRollNo = StudentDao.getStudentByRollNo(stdRollNo);
						
						if(getStudentByRollNo){
							System.out.println("Student Data by roll no Fetched successfully .....!");
						}else{
							System.out.println("Something went wrong!! Try again... ");
						}
						break;
						
					case 11:
						System.out.println("Getting Consolidated Students Report card...");
						// Perform get consolidated students report card
						// operation
						break;
						
					case 12:
						System.out.println("Getting Single Student Report card by ID...");
						// Perform get single student report card by ID
						// operation
						break;
						
					case 13:
						System.out.println("Adding Question in Exam...");
						// Perform add question in exam operation
						
						System.out.println("Enter Question Id : ");
						int questionId = Integer.parseInt(br.readLine());
						
						System.out.println("Enter Question : ");
						String question = br.readLine();
						
						System.out.println("Enter Exam Id : ");
						int examId = Integer.parseInt(br.readLine());
						
						System.out.println("Enter Option 1 : ");
						String opt1 = br.readLine();
						
						System.out.println("Enter Option 2 : ");
						String opt2 = br.readLine();
						
						System.out.println("Enter Option 3 : ");
						String opt3 = br.readLine();
						
						System.out.println("Enter correct answer : ");
						String correctAns = br.readLine();
						
						Questions questions = new Questions(questionId,question,examId,opt1,opt2,opt3,correctAns);
						
						boolean addQuestions = QuestionsDao.insertQuestions(questions);
						
						if(addQuestions){
							System.out.println("Questions added Successfully!...");
						}else{
							System.out.println("Something went wrong!! Try again... ");
						}
						
						
						break;
						
					case 14:
						System.out.println("Updating Question in Exam...");
						// Perform update question in exam operation
						
						boolean updateQuestion;
						
						System.out.println("Enter Question Id to update: ");
						int queId = Integer.parseInt(br.readLine());
						
						System.out.println("Enter Question Id : ");
						int questId = Integer.parseInt(br.readLine());
						
						System.out.println("Enter Question : ");
						String questn = br.readLine();
						
						System.out.println("Enter Exam Id : ");
						int exmId = Integer.parseInt(br.readLine());
						
						System.out.println("Enter Option 1 : ");
						String option1 = br.readLine();
						
						System.out.println("Enter Option 2 : ");
						String option2 = br.readLine();
						
						System.out.println("Enter Option 3 : ");
						String option3 = br.readLine();
						
						System.out.println("Enter correct answer : ");
						String corrtAns = br.readLine();
						
						QuestionsDao.updateQuestion(queId,questId,questn,exmId,option1,option2,option3,corrtAns);
						
						if(updateQuestion=true){
							System.out.println("Question Updated Successfully!....");
						}else{
							System.out.println("Something went wrong!! Try again... ");
						}
						
						
						break;
						
					case 15:
						System.out.println("Deleting Question from Exam...");
						// Perform delete question from exam operation
						
						System.out.println("Enter Question Id to delete : ");
						int quesId = Integer.parseInt(br.readLine());
						
						boolean deleteQuestion = QuestionsDao.deleteQuestion(quesId);
						
						if (deleteQuestion) {
							System.out.println("Question Deleted successfully .....!");
						} else {
							System.out.println("Something went wrong!! Try again... ");
						}
						
						break;
						
					case 16:
						System.out.println("Displaying all Questions from Exam...");
						// Perform display all questions from exam operation
						
						QuestionsDao.displayAllQuesions();
						
						break;
						
					case 0:
						System.out.println("Exiting...");
						break;
						
					default:
						System.out.println("Invalid choice. Please try again.");
						break;
					}
				} while (adminChoice != 0);
				break;
			case 2:
				System.out.println("-----------------------Student----------------");
				System.out.println("Please enter your registered email:");
				String email = scanner.next();
				System.out.println("Please enter password provided by admin:");
				String password = scanner.next();

				// Perform student operations based on the email and password
				
				 Scanner input = new Scanner(System.in);
			        int choice;
			        
			        do {
			            System.out.println("-------------------Student Dashboard------------");
			            System.out.println("1. Go For Test");
			            System.out.println("2. See Your Report Card");
			            System.out.println("0. Exit");
			            System.out.println("-------------------------------------------------");
			            System.out.print("Enter your choice: ");
			            choice = input.nextInt();
			            
			            switch (choice) {
			                case 1:
			                    // Call the method or perform the action for "Go For Test" option
//			                    goForTest();
			                	System.out.println("Go for the test : ");
			                	
			                	System.out.println("Enter Exam Id to start exam : ");
			                	int examID1 = Integer.parseInt(br.readLine());
			                	
			                	boolean testQuestion = TestDao.displayAllQuesionsWithoutAns(examID1);
			                	
			                	if (testQuestion) {
									System.out.println("Enter your answer : ");
									String studentAns = br.readLine();
									
									System.out.println("Enter Question Id  : ");
									int quesId = Integer.parseInt(br.readLine());
									
									String checkCorrectAns = TestDao.correctAns(quesId);
//									System.out.printf(studentAns+" ====="+checkCorrectAns);
				
											
									if(studentAns.equals(checkCorrectAns)){
										System.out.println("Ans Correct");
										
									}else{
										System.out.println("Ans Wrong");
									}
								} else {
									System.out.println("Something went wrong!! Try again... ");
								}
			                	
			                	
			                	
			                    break;
			                case 2:
			                    // Call the method or perform the action for "See Your Report Card" option
//			                    seeReportCard();
			                	System.out.println("See Report Card");
			                    break;
			                case 0:
			                    System.out.println("Exiting Student Dashboard.");
			                    break;
			                default:
			                    System.out.println("Invalid choice. Please try again.");
			                    break;
			            }
			        } while (choice != 0);
			        
			        input.close();
			    
			    

				break;
			
			case 0:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (mainChoice != 0);

		scanner.close();
	}

}

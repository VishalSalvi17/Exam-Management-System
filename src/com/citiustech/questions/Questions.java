package com.citiustech.questions;

public class Questions {
	private int questionId;
    private String question;
    private int examID;
    private String opt1;
    private String opt2;
    private String opt3;
    private String correctAns;
    
	public Questions(int questionId, String question, int examID, String opt1, String opt2, String opt3,
			String correctAns) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.examID = examID;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.correctAns = correctAns;
	}

	public Questions(String question, int examID, String opt1, String opt2, String opt3, String correctAns) {
		super();
		this.question = question;
		this.examID = examID;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.correctAns = correctAns;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getExamID() {
		return examID;
	}

	public void setExamID(int examID) {
		this.examID = examID;
	}

	public String getOpt1() {
		return opt1;
	}

	public void setOpt1(String opt1) {
		this.opt1 = opt1;
	}

	public String getOpt2() {
		return opt2;
	}

	public void setOpt2(String opt2) {
		this.opt2 = opt2;
	}

	public String getOpt3() {
		return opt3;
	}

	public void setOpt3(String opt3) {
		this.opt3 = opt3;
	}

	public String getCorrectAns() {
		return correctAns;
	}

	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}

	@Override
	public String toString() {
		return "Questions [questionId=" + questionId + ", question=" + question + ", examID=" + examID + ", opt1="
				+ opt1 + ", opt2=" + opt2 + ", opt3=" + opt3 + ", correctAns=" + correctAns + "]";
	}
}

package com.quizapp.pojoClasses;

public class QuestionPojo {
	
	int qid;
	String ques;
	String opt1;
	String opt2;
	String opt3;
	String opt4;
	static final String opt5 = "Skip";  // Static field to store constant
	String rightAnswer;
	
	public QuestionPojo() {
		
	}
	
	public QuestionPojo(int qid, String ques, String opt1, String opt2, String opt3, String opt4, String rightAnswer) {
		super();
		this.qid = qid;
		this.ques = ques;
		this.opt1 = opt1;
		this.opt2 = opt2;
		this.opt3 = opt3;
		this.opt4 = opt4;
		this.rightAnswer = rightAnswer;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
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

	public String getOpt4() {
		return opt4;
	}

	public void setOpt4(String opt4) {
		this.opt4 = opt4;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	public static String getOpt5() {
		return opt5;
	}
	
	
	
	
	
	//con
	//gett
	//to string
	

}

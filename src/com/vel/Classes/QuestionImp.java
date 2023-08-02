package com.vel.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.vel.Interface.Question;

public class QuestionImp implements Question{


//	Resources
	static Connection con;
	Scanner scan =  new Scanner(System.in);
	PreparedStatement prs= null;
	
	
	//	This field belong to Database

	int qid;
	String ques;
	String opt1;
	String opt2;
	String opt3;
	String opt4;
	static final String opt5 = "Skip";  // Static field to store constant
	String rightAnswer;


	//	Constructor to get Connection
	public QuestionImp(Connection con) {
		QuestionImp.con = con;
	}

	
	@Override
	public void displayAllQuestion() {
		try {
			PreparedStatement prs = con.prepareStatement("Select qid, ques from question");
			ResultSet rs = prs.executeQuery();
		
//			It will show all the Question 1 by 1
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}
		
			System.out.println("Please select which Question do you want to Delete");
			int n = scan.nextInt();
			deleteQuestion();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	//  It will get the Questions from User and will store into the database
	@Override
	public void getQuestion() {

		System.out.println("Please Enter Question : -");
		ques = scan.nextLine();

		System.out.println("Please Enter 1st Option : -");
		opt1 = scan.nextLine();

		System.out.println("Please Enter 2nd Option : -");
		opt2 = scan.nextLine();

		System.out.println("Please Enter 3rd Option : -");
		opt3 = scan.nextLine();

		System.out.println("Please Enter 4th Option : -");
		opt4 = scan.nextLine();

		//		This will ask to add Right Answer
		System.out.println("Please Enter Right Answer : -");
		rightAnswer = scan.nextLine();
	}


	//	This Method will add Question by using Scanner Class
	@Override
	public void addQuestion() {

		try {
			
			prs = con.prepareStatement("insert into question (ques, opt1, opt2, opt3, opt4, opt5, rightAnswer)"
					+ " values(?,?,?,?,?,?,?)");

			prs.setString(1, ques);
			prs.setString(2, opt1);
			prs.setString(3, opt2);
			prs.setString(4, opt3);
			prs.setString(5, opt4);
			prs.setString(6, opt5);
			prs.setString(7, rightAnswer);

			int i = prs.executeUpdate();

			if(i==1) {
				System.out.println("Question Added Successfully...");
			}else {
				System.out.println("Something went wrong while adding Question...");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}		
	}


	@Override
	public void updateQuestion() {

	}


	@Override
	public void deleteQuestion() {
		
		
	}


}

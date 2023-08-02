package com.vel.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class MainClass extends ConnectionClass{

//	Scanner scan = new Scanner(System.in);
//
//	public void loginScreen() {
//		System.out.println("Please Enter your User id");
//		String userid = scan.next();
//		System.out.println("Please Enter your Password");
//		String password = scan.next();
//		
//		try {
//			PreparedStatement prs = con.prepareStatement("select Username, Password from LoginDetails");
//			ResultSet rs = prs.executeQuery(); 
//				
//			while(rs.next()) {
//				if((rs.getString(1).equals(userid)) && rs.getString(2).equals(password)){
//					System.out.println("Welcome "+ rs.getString(1));
//				}
//			}
//				
//		
//			} catch (SQLException e) {
//		
//			e.printStackTrace();
//		}
//	}
	

	public void firstScreen() {

		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Quiz based application");	
		System.out.println("User Operation");	
		System.out.print("1. Student Registration\t\t   ");
		System.out.println("2. Student Login");
		System.out.print("3. Display the list of questions   ");
		System.out.println("4. Store Quiz result into database");
		System.out.println("5. Display Quiz result");
		System.out.println("Admin Operation");
		System.out.println("6. Display all students score as per ascending order");
		System.out.println("7. Fetch student score by using id");
		System.out.println("8. Add question with 4 options into database");		

		System.out.println("Please select the option do you want to perform");
		int choice = scan.nextInt();
		
		
		switch(choice) {
//		Students Operations
//		case 1: registration();
//		break;
//		case 2: studLogin();
//		break;
	
		case 3:
				QuizTestImpl test = new QuizTestImpl(con);
				test.starTest();
		break;
		
//		case 4: storeQuizResult();
//		break;
//		case 5: displayQuizResult();
//		break;
		
//		Admin Opertions 
//		case 6: displayAllStudByScore();
//		break;
//		case 7: getStudById();
//		break;
	
		case 8: 
					QuestionImp ques = new QuestionImp(con);
					ques.getQuestion();
					ques.addQuestion();
		break;
		
		default: 
				System.out.println("Please select Correct Option");

		}
	}

	
	public static void main(String[] args) {
		
		ConnectionClass obj = new ConnectionClass();
		Connection con = obj.getConnectionDetails();
	
		MainClass main = new MainClass();
		
		main.loginScreen();
		main.firstScreen();

	}

}

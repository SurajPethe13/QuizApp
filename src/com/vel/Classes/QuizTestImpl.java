package com.vel.Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;



public class QuizTestImpl extends ConnectionClass{

//	Resources
	static Connection con;
	Scanner scan = new Scanner(System.in);
	PreparedStatement prs= null;
	int marks;
	
	ArrayList<String> userAnswer = new ArrayList<String>(); 
	
	public void starTest() {
		
		try {
			PreparedStatement prs = con.prepareStatement("select * from question");
			ResultSet rs = prs.executeQuery();
			
			
			for(int i=0; rs.next(); i++)
			{
				System.out.println("Q. " + rs.getString(2)); 	  // This will print question
				System.out.print("A. " +rs.getString(3)+ "\t\t"); // This will print option1
				System.out.println("B. " +rs.getString(4));       // This will print option2
				System.out.print("C. " +rs.getString(5)+ "\t\t"); // This will print option3
				System.out.println("D. " +rs.getString(6));       // This will print option4
				
				System.out.println("\n Please select your Answer");
				userAnswer.add(scan.next()); 
				
				System.out.println();
				
				
				if(userAnswer.get(i).equals(rs.getString(8))) {
					marks = marks +  10;
				}			
			}
			
			System.out.println("Total Marks is " + marks);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void calculateGrade() {
		
		con.prepareStatement("insert into students(grade) values where ");
	}
	

	
	public QuizTestImpl(Connection con) {
		QuizTestImpl.con = con;
	}
}

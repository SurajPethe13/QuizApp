package com.vel.implClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.quizapp.pojoClasses.Student;
import com.quizapp.service.StudentService;

public class StudentServiceImpl implements StudentService {
	
	
	Connection connection=null;
	PreparedStatement psStatement=null;

	public static  Student getStudentInput() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first name");
		String fisrtName=scan.nextLine();
		
		System.out.println("Enter the last name");
		String  lastName=scan.nextLine();
		
		System.out.println("Enter the username ");
		String userName=scan.nextLine();
		
		System.out.println("Enter the password ");
		String password=scan.nextLine();
		
		
		System.out.println("Enter the city");
		String city=scan.nextLine();
		

		System.out.println("Enter the mailId");
		String mailId=scan.nextLine();
		
		System.out.println("Enter the mobile number");
		long mobileNo=scan.nextLong();
		
		//student class constructor
		Student studentObj=new Student(fisrtName, lastName, city, mobileNo, mailId, password, userName);
		System.out.println(studentObj);
		
		return studentObj;
		
	}
	

	@Override
	public void createStudent(Student student) {
		String query="insert into student(FirstName,LastName,City,MobileNo,MailId,SetPassword,UserName)values(?,?,?,?,?,?,?)";
		try {
			//get the connection object
			connection = ConnectionClass.getConnectionDetails();
			
			//create the Statement object
			psStatement= connection.prepareStatement(query);
			psStatement.setString(1, student.getFirstName());
			psStatement.setString(2, student.getLastName());
			psStatement.setString(3, student.getCity());
			psStatement.setLong(4,student.getMobileNo());
			psStatement.setString(5, student.getMailId());
			psStatement.setString(6, student.getSetPassword());
			psStatement.setString(7, student.getUserName());
			
			//send to the database
			int insertCount = psStatement.executeUpdate();
			System.out.println(insertCount+" record inserted successfully");
			
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				
				psStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
	
	
	
	

}

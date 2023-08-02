package com.quizapp.testApplication;

import java.util.Scanner;

import com.quizapp.pojoClasses.Student;
import com.quizapp.service.StudentService;
import com.vel.implClasses.StudentServiceImpl;

public class testapp {
	

	

	public static  void selectoptionsList() {
		Scanner scan =new Scanner(System.in);
		int userChoice=0;
		boolean exitFlag=false;

		System.out.println("\t\t\t!! Welcome to Quiz based application !!\n\n");
		
	do {	
			System.out.println("\t\t!! UserOperation !!\n");
			System.out.println("     Enter any option from the given  list(1-5)    \n");
			System.out.println("1. Student Registration\n2. Student Login\n3. Display the list of questions\n4. Store Quiz result into database\n5. Display Quiz result");
			userChoice=scan.nextInt();
			
			switch(userChoice) {
			
				
			case 1:System.out.println("StudentRegistration");
					Student student = StudentServiceImpl.getStudentInput();
					StudentService studentService=new StudentServiceImpl();
					studentService.createStudent(student);			
					break;
			case 5:
					exitFlag=true;
					break;
					
			}
		
		}while(!exitFlag);
	
	System.out.println("===========================");
	
	
		
		
	}
	
	public static void main(String[] args) {
		selectoptionsList();
		
		
		
	}

}

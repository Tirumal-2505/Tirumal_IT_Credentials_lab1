package com.gl.email.application;

import java.util.Scanner;

import com.gl.email.model.Employee;
import com.gl.email.service.Credential_service;

public class Application {
	public static void main(String[]args) {
	Employee emp = new Employee("Sirisha","Gorige");
	Credential_service cs = new Credential_service();
	
	String generatedEmail;
	String generatedPassword;
	//char[] generatedPassword;
	
	System.out.println("Please enter the department from the following ");
	System.out.println("1. Technical");
	System.out.println("2. Admin");
	System.out.println("3. Human Resource");
	System.out.println("4. Legal");
	
	Scanner sc= new Scanner(System.in);
	int input=sc.nextInt();
	
	switch(input) {
	
	case 1 :{
		generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
		break;
	}
	case 2 :{
		generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "admin");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
		break;
	}
	case 3 :{
		generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "humanresources");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
		break;
	}
	case 4 :{
		generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
		break;
	}
	default : {
		System.out.println("Invalid option selected....");
	}
	}

	
	}

}


/*using if and else statements.This is an alternate method,we can use by commenting from 
line 25 to 59 and then uncommenting the line 65 to 85*/

  /*if(input==1){
	  generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "tech");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
  }else if(input==2){
	  generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "admin");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
  }else if(input==3){
	  generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "humanresources");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
  }else if(input==4){
	  generatedEmail=cs.generateEmailAddress(emp.getFirstName(), emp.getLastName(), "legal");
		generatedPassword = cs.generatePassword();
		cs.showCredentials(emp, generatedEmail, generatedPassword);
  }else {
	  System.out.println("Invalid option");
  }
	}
}
 
*/

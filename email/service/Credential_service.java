package com.gl.email.service;

import java.util.Random;

import com.gl.email.model.Employee;

public class Credential_service {
	
	public String generatePassword() {
				String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()\"";
        Random r = new Random();
       String password = new String();
        ;
        int length = 8;
		for(int i=0;i<length;i++) {
			int rIndex = r.nextInt(s.length());
			password = password+s.charAt(rIndex);
			}
		return password;
		}
		
	/*	method thought in live session but it is generating only one password to all dept
	 * if this is incorporated we shall change the line 37 string password to char[] password
	 * 
	 * public char[] generatePassword() {
			char []password = new char[8]
					password[i]= s.charAt(r.nextInt(s.length()));
					*/

	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		String firstName1 = firstName.toLowerCase();
				String lastName1 = lastName.toLowerCase();
		return firstName1+lastName1+"@"+department+".gl.com" ;
		
	}
	public void showCredentials(Employee emp, String email, String password) {
		System.out.println("Dear "+ emp.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email---> "+ email);
		System.out.println("Password---> "+ password);
	
	}
	

}

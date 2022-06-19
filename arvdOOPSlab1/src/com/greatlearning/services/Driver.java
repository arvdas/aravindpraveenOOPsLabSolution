package com.greatlearning.services;
import java.util.Scanner;

import com.greatlearning.model.Employee;

public class Driver {

	public static void main(String[] args) {
		Employee emp=new Employee("Harshit","Choudhary");
		CredentialsServices c=new CredentialsServices();
		String generatedEmail;
		char[] generatedPassword;
		System.out.println("Enter the department");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resources");
		System.out.println("4.Legal");
		
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			generatedEmail=c.generatedEmailAddress(emp.getFName().toLowerCase(),emp.getLName().toLowerCase(),"technical");
			generatedPassword=c.generatedPassword();
			c.showCredentials(emp, generatedEmail, generatedPassword);
		}
		
		else if(choice==2)
		{
			generatedEmail=c.generatedEmailAddress(emp.getFName().toLowerCase(),emp.getLName().toLowerCase(),"admin");
			generatedPassword=c.generatedPassword();
			c.showCredentials(emp, generatedEmail,generatedPassword);
		}
		else if(choice==3)
		{
			generatedEmail=c.generatedEmailAddress(emp.getFName().toLowerCase(),emp.getLName().toLowerCase(),"hr");
			generatedPassword=c.generatedPassword();
			c.showCredentials(emp, generatedEmail,generatedPassword);
		}
		else if(choice==4)
		{
			generatedEmail=c.generatedEmailAddress(emp.getFName().toLowerCase(),emp.getLName().toLowerCase(),"legal");
			generatedPassword=c.generatedPassword();
			c.showCredentials(emp, generatedEmail,generatedPassword);
		}
		else {
			System.out.println("Invalid department");
		}
		

	}

}

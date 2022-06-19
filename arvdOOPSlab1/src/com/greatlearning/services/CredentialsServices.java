package com.greatlearning.services;
import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialsServices {
	public char[] generatedPassword() {
		String Cletters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Sletters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialcharacters="!@#$%^&*()_+=";
		String values=Cletters+Sletters+numbers+specialcharacters;
		Random random= new Random();
		char[] password=new char[8];
	    for(int i=0;i<8;i++) { 
	    	
	    	password[i]=values.charAt(random.nextInt(values.length()));
	    	
	}
	    return password;
	}    
	    
    public String generatedEmailAddress(String firstName,String lastName,String department) {
        return firstName+lastName+"@"+department+".company.com";	
    }
    public void showCredentials(Employee emp,String email,char[] generatedPassword) {
    	System.out.println("Dear"+emp.getFName()+"your generated credentials are as follows");
    	System.out.println("Email-->"+email);
    	System.out.print("Password-->"+"");
    	System.out.print(generatedPassword);
    }


}

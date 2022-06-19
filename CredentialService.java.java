package com.service;
import java.util.Random;

public class CredentialService {
	public static String department;
	public static String firstName;
	public static String lastName;
	String str="";
	public static String companyName=".abc.com";
	 int length=8;
	   int i;
	   String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	    String specialCharacters = "!@#$";
	    String numbers = "1234567890";
	    String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	    char[] password = new char[length];
public void generatePassword()
{
	
    Random random = new Random();
  

    password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
    password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
    password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
    password[3] = numbers.charAt(random.nextInt(numbers.length()));
 
    for(i = 4;i<length;i++) {
       password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
    }
  
 }


public void generateEmailAddress(String firstName,String lastName,String department,String companyName)
{
  
  
str=firstName+lastName+str+"@"+department+companyName;

	
}
public void showCredentials(String firstName,String lastName)
{ 
	System.out.println("Dear"+firstName+" "+lastName+"Your generated credentials are as follows: ");
	System.out.println(str);
	 System.out.println("Password is: "+password);
}


}
package com.userresistration;

import java.util.Scanner;
import java.util.regex.Pattern;


public class ValidFirstName {
	private static final String NAME = "[A-Z][a-z]{2,}";

	public void ValidateFirstName() throws InvalidUserInputException
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first Name : ");
		String firstName = scanner.next();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
		UserRegistrationInterface FirstNameValidate = fName -> {
			boolean result = Pattern.matches(NAME, fName);
			if (result) 
			{
				return result;
			} 
			else{
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME,"Invalid Firsrt Name");
			}
		};

	}
	public static void main(String args[])throws InvalidUserInputException
	{
		ValidFirstName validFirstName = new ValidFirstName(); 	
		validFirstName.ValidateFirstName();

	}
}



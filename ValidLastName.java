package com.userresistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidLastName {
	private static final String NAME = "[A-Z][a-z]{2,}";

	public void ValidateLastName() throws InvalidUserInputException
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter last Name : ");
		String lastName = scanner.next();
		System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
		UserRegistrationInterface lastNameValidate = lName -> {
			boolean result = Pattern.matches(NAME, lName);
			if (result) 
			{
				return result;
			} 
			else{
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME,"Invalid last Name");
			}
		};

	}
	public static void main(String args[]) throws InvalidUserInputException {
		ValidLastName validLastName = new ValidLastName();
		validLastName.ValidateLastName();
	}
}



package com.userresistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordRuleOne {
	private static final String PASWORD = "^(?=.*[A-Z]).{8,}$" ;
	public void validatePassword() throws InvalidUserInputException
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a password : ");
		String password = scanner.next();
		System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password));
		UserRegistrationInterface validPhoneNumber = vphoneNumber -> {
			boolean result = Pattern.matches(PASWORD, password);
			if (result) 
			{
				return result;
			} 
			else{
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD,"Invalid password");
			}
		};

	}
	public static void main(String args[]) throws InvalidUserInputException {
		ValidatePassword  validatePassword = new  ValidatePassword();
		validatePassword.validatePassword();
	}
}

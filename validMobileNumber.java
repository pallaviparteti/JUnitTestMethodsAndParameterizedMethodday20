package com.userresistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class validMobileNumber {
	private static final String PHONE_NUMBER = "^[\\d]{2}[\\s][\\d]{10}$";

	public void validatePhoneNumber() throws InvalidUserInputException
	{

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter phone number : ");
		String phoneNumber = scanner.next();
		System.out.println(Pattern.matches("^[\\d]{2}[\\s][\\d]{10}$", phoneNumber));
		UserRegistrationInterface validPhoneNumber = vphoneNumber -> {
			boolean result = Pattern.matches(PHONE_NUMBER, phoneNumber);
			if (result) 
			{
				return result;
			} 
			else{
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER,"Invalid phone number");
			}
		};

	}
	public static void main(String args[]) throws InvalidUserInputException {
		validMobileNumber validPhoneNumber = new validMobileNumber();
		validPhoneNumber.validatePhoneNumber();
	}
}

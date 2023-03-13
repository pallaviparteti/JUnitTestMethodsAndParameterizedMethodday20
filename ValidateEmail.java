package com.userresistration;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {


	private static final String EMAIL = "^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$";
	public void ValidateEmail()throws InvalidUserInputException{
		Scanner scanner = new Scanner(System.in);
		String email = scanner.next();
		//String email = "abc.xyz@bl.co.in";
		System.out.println("Email : " + email);
		System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));

		UserRegistrationInterface ValidateEmail = vemail -> {
			boolean result = Pattern.matches(EMAIL, email);
			if (result) 
			{
				return result;
			} 
			else{
				throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL,"Invalid email");
			}
		};

	}
	public static void main(String args[]) throws InvalidUserInputException {
		ValidateEmail validEmail = new ValidateEmail();
		validEmail.ValidateEmail();
	}
}

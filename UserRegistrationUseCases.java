package com.userresistration;

import java.util.Scanner;
import java.util.regex.Pattern;


public class UserRegistrationUseCases {

    //Use Case 1
    public void ValidateFirstName(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first Name : ");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", firstName));
    }
    //Use Case 2
    public void ValidateLastName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter last Name : ");
        String lastName = scanner.next();
        System.out.println(Pattern.matches("[A-Z][a-z]{2,}", lastName));
    }
    //Use Case 3
    public void ValidateEmail(){
        Scanner scanner = new Scanner(System.in);
        String email = "abc.xyz@bl.co.in";
        System.out.println("Email : " + email);
        System.out.println(Pattern.matches("^(abc)[.][a-z]+[@](bl)[.](co)[.][a-z]+$", email));
    }
    // Use case 4
    public void ValidateMobileNoFormat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile no. : ");
        String phNum = scanner.nextLine();
        System.out.println(Pattern.matches("[0-9]{2}[\\s][0-9]{10}", phNum));
    }
    //Use case 5
    public void PasswordRuleMinimum8Character(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^[a-zA-Z0-9].{7,}$", password));
    }
    //Use Case 6
    public  void PasswordRuleAtleastOneUpperCase(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z]).{8,}$", password));
    }
    //Use case 7
    public void PasswordRuleAtleastOneNumericValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$", password));
    }
    //Use case 8
    public void PasswordRuleExactlyOneSpecialCharacter(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password : ");
        String password = scanner.next();
        System.out.println(Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=[^@#!$%^&+=]*[@#!$%^&+=]" +
                "[^@#!$%^&+=]*$)(?=.*[0-9]).{8,}$", password));
    }
    //Use case 9

    public void ClearAllEmailSample(){
        String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

        System.out.println("Valid email :");
        emailValidate(validEmailSample);
        System.out.println("\nInvalid emails :");
        emailValidate(invalidEmailSample);
    }
    public static void emailValidate(String[] emails) {
        for(int i = 0; i< emails.length; i++ ){
            System.out.print(Pattern.matches("^[\\w+-]+(?:\\.[\\w+-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", emails[i]) + " ");
        }
    }
}
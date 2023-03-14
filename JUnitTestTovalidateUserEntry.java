package com.userresistration;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;



/**
 * Performing test cases for Email validation.
 */

public class JUnitTestTovalidateUserEntry {
	private String emailTest;
	private boolean expectedResult;
	private ValidateEmail validateEmail;

	public JUnitTestTovalidateUserEntry(String email, boolean expectedResult) {
		this.emailTest = email;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		validateEmail = new ValidateEmail();
	}

	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true},
			{"abc-100@yahoo.com", true},
			{"abc.100@yahoo.com", true},
			{"abc111@abc.com", true},
			{"abc-100@abc.net", true},
			{"abc.100@abc.com.au", true},
			{"abc@1.com", true},
			{"abc@gmail.com.com", true},
			{"abc+100@gmail.com", true},
			{"abc", false},
			{"abc@.com.my", false},
			{"abc123@gmail.a", false},
			{"abc123@.com", false},
			{"abc123@.com.com", false},
			{".abc@abc.com", false},
			{"abc()*@gmail.com", false},
			{"abc@%*.com", false},
			{"abc..2002@gmail.com", false},
			{"abc.@gmail.com", false},
			{"abc@abc@gmail.com", false},
			{"abc@gmail.com.1a", false},
			{"abc@gmail.com.aa.au", false}
		});
	}

	@Test
	public void givenEmailAsVar_ShouldReturnTrueorFalse() {
		Assertions.assertEquals(expectedResult, validateEmail.validateEmail(emailTest));
	}

}
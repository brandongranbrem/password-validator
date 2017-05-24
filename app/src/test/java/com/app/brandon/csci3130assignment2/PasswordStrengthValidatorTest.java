package com.app.brandon.csci3130assignment2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test to test the strength of a password, based on the number of validation checks a password passes
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class PasswordStrengthValidatorTest {
    private PasswordStrengthValidator validator;
    private String password1;
    private String password2;
    private String password3;

    @Before
    public void setUp(){
        validator = new PasswordStrengthValidator();
        password1 = "password";
        password2 = "pass";
        password3 = "passwords";
    }

    @Test
    public void validatePasswords() throws Exception {
        //Validate a password which is equal to password
        assertEquals(1, validator.validate(password1));
        //Validate a password that has a length less than 8 characters
        assertEquals(1, validator.validate(password2));
        //Validate a password which is not password and has a length greater than 8 characters
        assertEquals(2, validator.validate(password3));
    }
}
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
    private String password4;
    private String password5;
    private String password6;

    @Before
    public void setUp(){
        validator = new PasswordStrengthValidator();
        password1 = "password";
        password2 = "pass";
        password3 = "passwords";
        password4 = "passw0rd";
        password5 = "PaSSw0rD";
        password6 = "Passw0rd!";
    }

    @Test
    public void validatePassword1() throws Exception {
        //Validate a password which is equal to password
        assertEquals(1, validator.validate(password1));
        //Validate a password that has a length less than 8 characters
        assertEquals(1, validator.validate(password2));
        //Validate a password which is not password and has a length greater than 8 characters
        assertEquals(2, validator.validate(password3));
        assertEquals(3, validator.validate(password4));
        assertEquals(4, validator.validate(password5));
        assertEquals(5, validator.validate(password6));
    }
}
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
        password6 = "Passw0rd*";
    }

    @Test
    public void validatePassword1() throws Exception {
        //Validate a password which is equal to password
        //This password should pass 1 strength test
        assertEquals(1, validator.validate(password1));
    }
    @Test
    public void validatePassword2() throws Exception {
        //Validate a password that has a length less than 8 characters
        //This password should pass 1 strength test
        assertEquals(1, validator.validate(password2));
    }
    @Test
    public void validatePassword3() throws Exception {
        //Validate a password which is not password and has a length greater than 8 characters
        //This password should pass 2 strength tests
        assertEquals(2, validator.validate(password3));
    }
    @Test
    public void validatePassword4() throws Exception {
        //Validate a password which contains a number
        //This password should pass 3 strength tests
        assertEquals(3, validator.validate(password4));
    }
    @Test
    public void validatePassword5() throws Exception {
        //Validate a password which contains a number and uppercase letter
        //This password should pass 4 strength tests
        assertEquals(4, validator.validate(password5));

    }
    @Test
    public void validatePassword6() throws Exception {
        //Validate a password which contains a number, uppercase letter and special character.
        //This password should pass all 5 strength tests
        assertEquals(5, validator.validate(password6));
    }

}
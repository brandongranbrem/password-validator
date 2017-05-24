package com.app.brandon.csci3130assignment2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void validPassword() throws Exception {
        PasswordStrengthValidator validator = new PasswordStrengthValidator();
        String password1 = "password";
        String password2 = "pass";
        String password3 = "passwords";

        assertEquals(1, validator.validate(password1));
        assertEquals(1, validator.validate(password2));
        assertEquals(2, validator.validate(password3));
    }
}
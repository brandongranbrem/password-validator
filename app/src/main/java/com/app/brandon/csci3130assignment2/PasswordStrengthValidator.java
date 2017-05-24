package com.app.brandon.csci3130assignment2;

/**
 * Created by Brandon on 2017-05-23.
 */

public class PasswordStrengthValidator {
    public int validate(String password){
        int numRulesPassed = 0;
        if(!password.equals("password")){
            numRulesPassed++;
        }
        if(password.length() >=8){
            numRulesPassed++;
        }
        return numRulesPassed;
    }
}

package com.app.brandon.csci3130assignment2;

/**
 * Created by Brandon on 2017-05-23.
 */

//Class to validate the stength of a password
public class PasswordStrengthValidator {

    //Method to validate a password. Returns the number of rules the password satisfys
    public int validate(String password){
        //Keeps track of the number of rules the password satisfys
        int numRulesPassed = 0;
        //Check 1: Ensure the password given is not 'password'
        if(!password.equals("password")){
            numRulesPassed++;
        }
        //Check 2: Ensure the password given is at least 8 characters in length
        if(password.length() >=8){
            numRulesPassed++;
        }
        //Check 3: Ensure password contains at least one number
        if(password.matches(".*[0-9].*")){
            numRulesPassed++;
        }
        //Check 4: Ensure password contains at least one uppercase letter
        if(password.matches(".*[A-Z].*")){
            numRulesPassed++;
        }
        //Check 5: Ensure password contains at least one special character
        if(password.matches(".*[^A-Za-z0-9].*")){
            numRulesPassed++;
        }
        //Return the number of checks the password met
        return numRulesPassed;
    }
}

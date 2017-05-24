package com.app.brandon.csci3130assignment2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //TextView to display message to user
    TextView message;
    //Button to signal the user has inputted a password
    Button validate;
    //Text field for user to input a password
    EditText password;
    PasswordStrengthValidator validator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        validator = new PasswordStrengthValidator();
        message = (TextView) findViewById(R.id.passwordStrengthMessage);
        validate = (Button) findViewById(R.id.validateButton);
        password = (EditText) findViewById(R.id.inputPassword);

        //Update the TextView with a new message based on the password inputted when the user presses the button
        validate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String verifyPassword = password.getText().toString();
                int strength = validator.validate(verifyPassword);
                if(strength ==5){
                    message.setText("Password is Strong!");
                }
                else{
                    message.setText("Password is Weak!");
                }
            }

        });
    }
}

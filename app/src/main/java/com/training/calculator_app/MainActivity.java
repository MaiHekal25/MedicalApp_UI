package com.training.calculator_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

/**ViewBinding binding;
    String pass = "666666";
    String phone = "01026814546";
    MaterialButton btn_login;
    EditText textOne;
    EditText textTwo;**/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**btn_login = findViewById(R.id.login);
        textOne = findViewById(R.id.boxOne);
        textTwo = findViewById(R.id.boxTwo);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputPhone = textOne.getText().toString();
                String inputPassword = textTwo.getText().toString();
                validation(inputPhone,inputPassword);

            }
        });**/


    }
    /**private void validation(String inputPhone , String inputPassword){
        if(inputPhone.equals(phone) && inputPassword.equals(pass)){
            Toast.makeText(MainActivity.this, "Login succeeded", Toast.LENGTH_SHORT).show();
        } else if (inputPhone.isEmpty()) {
            textOne.setError("Required");
        } else if (inputPassword.isEmpty()) {
            textTwo.setError("Required");
        } else if (inputPassword.length() >10) {
            textTwo.setError("Password can't be more than 10");
        } else{
            Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
        }
    }**/
}
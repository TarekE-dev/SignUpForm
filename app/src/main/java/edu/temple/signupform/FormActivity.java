package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.submitButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ((TextView) findViewById(R.id.nameText)).getText().toString();
                String email = ((TextView) findViewById(R.id.emailText)).getText().toString();
                String pass = ((TextView) findViewById(R.id.passText)).getText().toString();
                String passConfirm = ((TextView) findViewById(R.id.confirmPass)).getText().toString();
                if(name.length() == 0 || email.length() == 0 || pass.length() == 0 || passConfirm.length() == 0){
                    Toast.makeText(FormActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
                    return;
                }else if(!pass.equals(passConfirm)){
                    Toast.makeText(FormActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    Toast.makeText(FormActivity.this, "Welcome " + name, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

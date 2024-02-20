package com.example.libmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btn_login = findViewById(R.id.btn_login);
        EditText editText_Name = findViewById(R.id.editText_Name);
        EditText editText_Password = findViewById(R.id.editText_Password);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(LoginActivity.this, BookListActivity.class);
                startActivity(intent);
//                if(editText_Name.getText().equals("admin") && editText_Password.getText().equals("admin") ) {
//
//                }else {
//                    Toast.makeText(getApplicationContext(), "Enter correct credentials",
//                        Toast.LENGTH_LONG).show();
//                }
            }
        });
    }
}
package com.example.testmysql;


import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    EditText nameText, passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameText = findViewById(R.id.name);
        passwordText = findViewById(R.id.password);

    }
    public void onLogin(View view){
        String name = nameText.getText().toString();
        String password = passwordText.getText().toString();
        String type = "login";

        BackgroudWork backgroudWork = new BackgroudWork(this);
        backgroudWork.execute(type, name, password);

    }
}
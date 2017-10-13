package com.example.irisha.task_1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1){
            if (resultCode == Activity.RESULT_OK){
                String firstname  = data.getStringExtra(Constants.FIRSTNAME);
                String lastname = data.getStringExtra(Constants.LASTNAME);

                TextView firstnameText  = (TextView) findViewById(R.id.firstnameInput);
                TextView lastnameText = (TextView) findViewById(R.id.lastnameInput);

                firstnameText.setText(firstname);
                lastnameText.setText(lastname);
            }
        }
    }
}

package com.example.irisha.task_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by irisha on 29.09.2017.
 */

public class FormActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);
    }

    public void onSubmit (View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText firstnameText = (EditText) findViewById(R.id.firstnameInput);
        EditText lastnameText = (EditText) findViewById(R.id.lastnameInput);


        String firstnameInputString = firstnameText.getText().toString();
        String lastnameInputString = lastnameText.getText().toString();

        intent.putExtra(Constants.FIRSTNAME, firstnameInputString);
        intent.putExtra(Constants.LASTNAME, lastnameInputString);

        setResult(Activity.RESULT_OK, intent);
        finish();

    }

}


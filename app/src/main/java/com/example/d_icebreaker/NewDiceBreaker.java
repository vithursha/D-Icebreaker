package com.example.d_icebreaker;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewDiceBreaker extends AppCompatActivity {


    String text;
    EditText textInput;

    Button SaveButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        textInput = (EditText) findViewById(R.id.editText);
        SaveButton = (Button) findViewById(R.id.button4);
        SaveButton.setOnClickListener((new View.OnClickListener() {
            public void onClick(View v) {
                text = textInput.getText().toString();

            }
        }));



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_dice_breaker);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}

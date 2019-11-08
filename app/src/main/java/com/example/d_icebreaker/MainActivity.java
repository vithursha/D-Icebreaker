package com.example.d_icebreaker;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //////////////////////////////////////
       // button = (Button) findViewById(R.id.button3);
        //button.setOnClickListener(new View.OnClickListener() {
            //public void onClick(View v) {
                //openActivity2();
            //}

        //});



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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);


    }

    public void On_Button_Click(View view) {

        // initialise score to 0
        int score = 0;

        TextView tv = this.findViewById(R.id.textView);
        EditText et = this.findViewById(R.id.editText2);
        TextView sc = this.findViewById(R.id.textView4);

        try {
            // get user input
            int userInput = Integer.parseInt(et.getText().toString());
            Random r = new Random();
            // generate a number between 1-6
            int number = r.nextInt(6 - 1 + 1) + 1;
            // convert the number to string and display it on textView
            tv.setText(Integer.toString(number));



            if (userInput == number) {
                // if the input is the same to the dice number create a Toast with a congratulation
                // and increment the score by one each time
                Toast.makeText(this, "Congratulations", Toast.LENGTH_SHORT).show();
                score = score + 1;
                sc.setText(Integer.toString(score));
            }
        } catch (Exception ex) {
            Log.e("ButtonErrors", ex.toString());


        }
    }


    public void Dice_Breaker(View view) {
        // create an empty Arraylist
        List<String> list;
        list = new ArrayList<>();
        Random r = new Random();
        // generate a random number between 1-6
        int number = r.nextInt(6 - 1 + 1) + 1;


        // as there is no zero on the dice create an empty item for list(0)
        list.add(" ");
        list.add("If you could go anywhere in the world, where would you go?");
        list.add("If you were stranded on a desert island, what 3 things would you want to take home with you?");
        list.add("If you could eat only one food for the rest of your life, what would it be?");
        list.add("If you won a million pounds, what is the first thing you would buy?");
        list.add("If you could spend the day with one fictional character, who would it be?");
        list.add("If you found a magic lantern and a genie gave you 3 wishes, what would it be?");

        String Message = list.get(number);
        TextView db = this.findViewById(R.id.textView3);
        db.setText(Message);
    }

    //public void openActivity2() {
        //Intent intent = new Intent(this, NewDiceBreaker.class);
        //startActivity(intent);
    }



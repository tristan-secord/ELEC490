package com.example.elec490.fitnesstracker;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;


public class Profile extends ActionBarActivity {

      //  implements DialogInterface.OnClickListener

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // eate 4 buttons for each profile along with thumbnail pic
        // onclick listener?
        // check if empty (if not empty then head to what is available now) / load profile
        // call function
        ImageButton Gaston = (ImageButton) findViewById(R.id.gaston);
        ImageButton Phil = (ImageButton) findViewById(R.id.phil);
        ImageButton Flounder = (ImageButton) findViewById(R.id.flounder);
        ImageButton Coyote = (ImageButton) findViewById(R.id.coyote);// button naming
//
        Gaston.setOnClickListener(new View.OnClickListener() {
            public void onClick(View r) {
                Intent gaston = new Intent(getApplicationContext(), com.example.elec490.fitnesstracker.Gaston.class);
                startActivity(gaston);
            }

        });
        Phil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View p) {
                Intent phil = new Intent(getApplicationContext(), com.example.elec490.fitnesstracker.Phil.class);
                startActivity(phil);
            }

        });
        Flounder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View f) {
                Intent flounder = new Intent(getApplicationContext(), com.example.elec490.fitnesstracker.Flounder.class);
                startActivity(flounder);
            }

        });

        Coyote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View o) {
                Intent coyote = new Intent(getApplicationContext(), com.example.elec490.fitnesstracker.Coyote.class);
                startActivity(coyote);
            }

        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
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
}

// Promt ask user to pick from 1 of four different profiles
// if profile hasn't been initiated then do this otherwise get saved data
// if user selects new profile ask user for Height, Weight, sex, and get heart rate data
// save user information
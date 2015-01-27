package com.example.elec490.fitnesstracker;

import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class Profile extends ActionBarActivity implements DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // eate 4 buttons for each profile along with thumbnail pic
        // onclick listener?
        // check if empty (if not empty then head to what is available now) / load profile
        // call function
       Button Gaston = (Button) findViewById(R.id.gaston);
       Button Phil = (Button) findViewById(R.id.phil);
      Button Flounder = (Button) findViewById(R.id.flounder);
       Button Coyote = (Button) findViewById(R.id.coyote);// button naming

     /* Gaston.setOnClickListener(function);
    }

public void function{

        int age1;
        boolean gender;
        int weight1;
        int height1;
        int RestHeartRate1;

        if( (age1!=0)&&(RestHeartRate1!=0)){
            // call main activity page and update variables into class

        }
*/

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
package com.example.elec490.fitnesstracker;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.elec490.fitnesstracker.R;

public class Gaston extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gaston);

        ImageButton back = (ImageButton) findViewById(R.id.back);
        ImageButton enter = (ImageButton) findViewById(R.id.enter);


        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View b) {
                Intent back = new Intent(getApplicationContext(), com.example.elec490.fitnesstracker.Profile.class);
                startActivity(back);

            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            public void onClick(View e) {
                Intent enter = new Intent(getApplicationContext(), com.example.elec490.fitnesstracker.MainActivity.class);
                startActivity(enter);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gaston, menu);
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


           //@Override
           // public void onClick(View c) {

          // }

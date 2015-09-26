package com.example.deveshwar.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button);
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "This button will launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
            }
        };
        b.setOnClickListener(listener);
        Button b2 = (Button) findViewById(R.id.button2);
        listener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
            }
        };
        b2.setOnClickListener(listener);
        Button b3 = (Button) findViewById(R.id.button3);
        listener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "This button will launch Library App!" , Toast.LENGTH_SHORT ).show();
            }
        };
        b3.setOnClickListener(listener);
        Button b4 = (Button) findViewById(R.id.button4);
        listener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "This button will launch Build it Bigger!" , Toast.LENGTH_SHORT ).show();
            }
        };
        b4.setOnClickListener(listener);
        Button b5 = (Button) findViewById(R.id.button5);
        listener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "This button will launch Bacon Reader!" , Toast.LENGTH_SHORT ).show();
            }
        };
        b5.setOnClickListener(listener);
        Button b6 = (Button) findViewById(R.id.button6);
        listener = new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "This button will launch My Capstone App!" , Toast.LENGTH_SHORT ).show();
            }
        };
        b6.setOnClickListener(listener);
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
}

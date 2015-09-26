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
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        Button b4 = (Button) findViewById(R.id.button4);
        Button b5 = (Button) findViewById(R.id.button5);
        Button b6 = (Button) findViewById(R.id.button6);
        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "This button will launch Spotify Streamer!" , Toast.LENGTH_SHORT ).show();
                Toast.makeText(getBaseContext(), "This button will launch Scores App!" , Toast.LENGTH_SHORT ).show();
                Toast.makeText(getBaseContext(), "This button will launch Library App!" , Toast.LENGTH_SHORT ).show();
                Toast.makeText(getBaseContext(), "This button will launch Build it Together!" , Toast.LENGTH_SHORT ).show();
                Toast.makeText(getBaseContext(), "This button will launch Bacon Reader!" , Toast.LENGTH_SHORT ).show();
                Toast.makeText(getBaseContext(), "This button will launch My Capstone App!" , Toast.LENGTH_SHORT ).show();
            }
        };
        b.setOnClickListener(listener);
        b2.setOnClickListener(listener);
        b3.setOnClickListener(listener);
        b4.setOnClickListener(listener);
        b5.setOnClickListener(listener);
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

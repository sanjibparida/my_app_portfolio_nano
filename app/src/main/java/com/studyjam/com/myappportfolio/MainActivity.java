package com.studyjam.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button clickButton1 = (Button) findViewById(R.id.button);
        clickButton1.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"This button will launch my popular movies app.", Toast.LENGTH_LONG).show();


            }
        });
        Button clickButton2 = (Button) findViewById(R.id.button2);
        clickButton2.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"This button will launch my Stock Hawk app.", Toast.LENGTH_LONG).show();


            }
        });
        Button clickButton3 = (Button) findViewById(R.id.button3);
        clickButton3.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"This button will launch my build it bigger app.", Toast.LENGTH_LONG).show();


            }
        });
        Button clickButton4 = (Button) findViewById(R.id.button4);
        clickButton4.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"This button will launch my make your app material app.", Toast.LENGTH_LONG).show();


            }
        });
        Button clickButton5 = (Button) findViewById(R.id.button5);
        clickButton5.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"This button will launch my go ubiquitous app.", Toast.LENGTH_LONG).show();


            }
        });
        Button clickButton6 = (Button) findViewById(R.id.button6);
        clickButton6.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"This button will launch my capstone app.", Toast.LENGTH_LONG).show();


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
}

package com.simbiosyscorp.tutorials.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends Activity {
Button button;
    double lat,lon;
    EditText latEditText,lonEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        button= (Button) findViewById(R.id.map);
        latEditText= (EditText) findViewById(R.id.lat);
        lonEditText= (EditText) findViewById(R.id.lon);

        //Listener implemented in-place for Button-click
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Input received from the EditText is in String format.
                //Converting input to double.
                lat= Double.parseDouble(latEditText.getText().toString());

                lon= Double.parseDouble(lonEditText.getText().toString());
                //Intent to start MapsActivity. Passing Latitude and Longitude values
                Intent intent = new Intent(getApplicationContext(),MapsActivity.class);
                intent.putExtra("LAT",lat);
                intent.putExtra("LON",lon);
                startActivity(intent);
            }
        });
    }


}

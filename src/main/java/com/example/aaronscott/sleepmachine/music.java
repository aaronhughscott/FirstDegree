package com.example.aaronscott.sleepmachine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;


public class music extends Activity {
    int numOfBands =0;
    int pricePerTicket=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_layout);
        final Button confirmButton = (Button) findViewById(R.id.buttonOne);
        final EditText bands = (EditText) findViewById(R.id.textEdit1);
        final EditText price = (EditText) findViewById(R.id.textEdit2);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numOfBands = Integer.parseInt(bands.getText().toString());
                pricePerTicket = Integer.parseInt(price.getText().toString());
                Log.i("MusicClass","Number of Bands is " + numOfBands);
                Log.i("MusicClass","price of tickets " + pricePerTicket);
                Intent intent = new Intent(music.this, artist.class);

                intent.putExtra("PRICEOFTICKETS", pricePerTicket);
                intent.putExtra("NUMOFBANDS", numOfBands);
                startActivity(intent);

            }


        });
    }
}
package com.example.aaronscott.sleepmachine;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by aaronscott on 11/15/15.
 */
public class artist extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_layout);
        final TextView result = (TextView) findViewById(R.id.output);
        Intent intent = getIntent();

        int numBands = intent.getIntExtra("NUMOFBANDS", 0);
        int priceTicket = intent.getIntExtra("PRICEOFTICKETS", 0);
        Log.i("ArtistClass", "Number of Bands is " + numBands);

    }
}

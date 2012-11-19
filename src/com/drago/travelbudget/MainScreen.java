package com.drago.travelbudget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void newTravelBtn_Click(View v){
        Intent intent = new Intent(this, NewTravelActivity.class);
        startActivity(intent);
    }

    public void oldTravelBtn_Click(View v){
        Intent intent = new Intent(this, RecentTravelActivity.class);
        startActivity(intent);
    }
}

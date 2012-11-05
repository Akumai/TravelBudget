package com.drago.travelbudget;

import android.app.Activity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.EventObject;

public class MainScreen extends Activity {
    public static int counter = 0;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void newTravelBtn_Click(View v){
        Button b = new Button(MainScreen.this);

        b.setText("Button " + counter++);
        b.setWidth(200);
        b.setHeight(30);
        b.buildLayer();
    }
}

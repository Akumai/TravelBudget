package com.drago.travelbudget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This activity for the New travel Screen
 */
public class NewTravelActivity extends Activity {
    public static final String EMPTY_STRING = "";
    public final ArrayList<String> friendsList = new ArrayList<String>();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_travel_screen);
    }

    public void newTravelAddFriend_Click(View v){
        EditText friendsName = (EditText) findViewById(R.id.friend_name);
        friendsName.setText(EMPTY_STRING);
        String newFriendsName = friendsName.getText().toString().trim();
        if (newFriendsName.equals(EMPTY_STRING)){
            return;
        }
        friendsList.add(newFriendsName);
        LinearLayout friendsLayout = (LinearLayout) findViewById(R.id.friends_layout);
        LinearLayout row = new LinearLayout(this);
        row.setOrientation(LinearLayout.HORIZONTAL);
        row.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        TextView tv = new TextView(this);
        tv.setText(newFriendsName);
        row.addView(tv);
//        Button removeBtn = new Button(this);
//        removeBtn.setText(R.string.new_travel_remove_btn_label);
//        removeBtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT, 4f));
//        removeBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.w("DragoLog", "RemoveClicked");
//            }
//        });
//        row.addView(removeBtn);
        // Adding new friends name to the top of the list
        friendsLayout.addView(row, 0);
    }

    public void newTravelSave_Click(View v){
        //TODO: Save to database
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

}
package com.drago.travelbudget;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * This activity for the New travel Screent
 */
public class NewTravelActivity extends Activity {
    public static final String EMPTY_STRING = "";
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_travel_screen);
    }

    public void newTravelAddFriend_Click(View v){
        EditText friendsName = (EditText) findViewById(R.id.friend_name);
        String newFriendsName = friendsName.getText().toString();
        if (newFriendsName.trim() == EMPTY_STRING){
            return;
        }
        LinearLayout friendsList = (LinearLayout) findViewById(R.id.friends_list);
        friendsName.setText(EMPTY_STRING);
        TextView tv = new TextView(this);
        tv.setText(newFriendsName);
        // Adding new friends name to the top of the list
        friendsList.addView(tv, 0);
    }

}
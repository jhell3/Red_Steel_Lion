package com.example.bluebalm;

import android.os.Bundle;
//import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

/**
 * used to select how long they will listen. 
 */
public class Music_Time_Selection extends AppCompatActivity {
    private TextView mTextMessage;

//    Intent intent = getIntent();
//    String musicSelect = intent.getStringExtra("song");
//    intent = new Intent(this, Instructions.class);
//    intent.putExtra("song", "instrumental");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_time_selection);
        mTextMessage = findViewById(R.id.message);
    }

    /**
     * @param button5 used to set time to 5 min
     */
    public void on5min(View button5){
        Intent currentIntent = getIntent();
        String musicSelect = currentIntent.getStringExtra("song");
        Intent intent = new Intent(this, Instructions.class);
        intent.putExtra("song", musicSelect);
        startActivity(intent);
    }

    /**
     * @param button6 used to set time to 10 min
     */
    public void on10min(View button6){
        Intent currentIntent = getIntent();
        String musicSelect = currentIntent.getStringExtra("song");
        Intent intent = new Intent(this, Instructions.class);
        intent.putExtra("song", musicSelect);
        startActivity(intent);
    }

    /**
     * @param button7 used to set time to 20 min
     */
    public void on20min(View button7){
        Intent currentIntent = getIntent();
        String musicSelect = currentIntent.getStringExtra("song");
        Intent intent = new Intent(this, Instructions.class);
        intent.putExtra("song", musicSelect);
        startActivity(intent);
    }

}

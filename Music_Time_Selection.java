package com.example.bluebalm;

import android.os.Bundle;
//import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

public class Music_Time_Selection extends AppCompatActivity {
    private TextView mTextMessage;

//    Intent intent = getIntent();
//    String musicSelect = intent.getStringExtra("song");
//    intent = new Intent(this, Instructions.class);
//    intent.putExtra("song", "instrumental");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music__time__selection);
        mTextMessage = findViewById(R.id.message);
    }

    public void on5min(View button5){
        Intent currentIntent = getIntent();
        String musicSelect = currentIntent.getStringExtra("song");
        Intent intent = new Intent(this, Instructions.class);
        intent.putExtra("song", musicSelect);
        startActivity(intent);
    }

    public void on10min(View button6){
        Intent currentIntent = getIntent();
        String musicSelect = currentIntent.getStringExtra("song");
        Intent intent = new Intent(this, Instructions.class);
        intent.putExtra("song", musicSelect);
        startActivity(intent);
    }

    public void on20min(View button7){
        Intent currentIntent = getIntent();
        String musicSelect = currentIntent.getStringExtra("song");
        Intent intent = new Intent(this, Instructions.class);
        intent.putExtra("song", musicSelect);
        startActivity(intent);
    }

}

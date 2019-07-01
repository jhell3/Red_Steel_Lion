package com.example.bluebalm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Instructions extends AppCompatActivity {
   private MediaPlayer song;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        Intent intent = getIntent();
        String musicSelect = intent.getStringExtra("song");
       switch (musicSelect)
       {
           case "instrumental":
               song = MediaPlayer.create(this,R.raw.instramental);
               song.start();
               break;
           case "whitenoise":
               song = MediaPlayer.create(this,R.raw.whitenoise);
               song.start();
               break;
          case "water":
               song = MediaPlayer.create(this,R.raw.water);
               song.start();
               break;
           case "nature":
               song = MediaPlayer.create(this,R.raw.nature);
               song.start();
               break;        }
    }
    public void onStop(View button9){
        song.stop();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (song != null) song.release();
    }
}

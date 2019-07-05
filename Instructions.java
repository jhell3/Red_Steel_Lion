package com.example.bluebalm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Last activity. Plays music when created, and has various buttons to pause, play, and stop.
 */
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

    /**
     *
     * @param button9 stop the music
     */
    public void onStop(View button9){
         if (song.isPlaying()) {
            song.stop();
        }
    }
    @Override
    /**
     * onDestroy is used to stop the song. 
     */
    public void onDestroy() {
        super.onDestroy();
        if (song != null) song.release();
    }

    /**
     * 
     * @param button10 pause and play music. 
     */
    public void pause(View button10){
        if (song.isPlaying()){
            song.pause();
        }
        else
            song.start();
    }
}

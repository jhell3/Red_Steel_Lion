package com.example.bluebalm;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.io.Console;
import java.io.IOException;

/**
 * Last activity. Plays music when created, and has various buttons to pause, play, and stop.
 */
public class Instructions extends AppCompatActivity {
    private MediaPlayer song;

    private boolean pause = false;
    private long timeRemaining = 0;
    final Instructions instructions = this;
    private CountDownTimer timer;
    final TextView tView = findViewById(R.id.timer);

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        Intent intent = getIntent();
        String musicSelect = intent.getStringExtra("song");
        switch (musicSelect) {
            case "instrumental":
                song = MediaPlayer.create(this, R.raw.instramental);
                song.start();
                break;
            case "whitenoise":
                song = MediaPlayer.create(this, R.raw.whitenoise);
                song.start();
                break;
            case "water":
                song = MediaPlayer.create(this, R.raw.water);
                song.start();
                break;
            case "nature":
                song = MediaPlayer.create(this, R.raw.nature);
                song.start();
                break;
        }

        Intent intentTimer = getIntent();
        String timerText = intentTimer.getStringExtra("time");
        System.out.println("here i is");
        long countDownInterval = 1000;
        long millis;
        switch (timerText) {
            case "5":millis = 3000000;
                break;
            case "10":
                millis = 6000000;
                break;
            case "20":
                millis = 12000000;
                break;
            default:
                millis = 4206969; //this shouldn't happen
        }
        newTimer(millis, countDownInterval);
        timer.start();
    }


    /**
     * @param button9 stop the music
     */
    public void onStop(View button9) {
        if (song.isPlaying()) {
            song.stop();
            try {
                song.prepare();
            } catch (IOException e) {
                //log.error(e);
            }
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
     * @param button10 pause and play music.
     */
    public void pause(View button10) {
        if (song.isPlaying()) {
            song.pause();
            pause = true;
        }
    }

    /**
     * palys song
     *
     * @param button
     */
    public void play(View button) {
        if (!song.isPlaying()) {
            song.start();
            pause = false;
        }
    }

    public void newTimer(long millis, long countDownInterval) {
        timer = new CountDownTimer(millis, countDownInterval) {
            public void onTick(long millisUntilFinished) {
                if (pause) {
                    cancel();
                } else {
                    tView.setText("" + millisUntilFinished / 1000);
                    timeRemaining = millisUntilFinished;
                }
            }

            @Override
            public void onFinish() {
                tView.setText("Done");
                instructions.finish();
            }
        };
    }
}

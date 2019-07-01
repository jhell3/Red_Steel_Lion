package com.example.bluebalm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInstrumental(View button){

        Intent intent = new Intent(this, Music_Time_Selection.class);
        intent.putExtra("song", "instrumental");
        startActivity(intent);
    }

    public void onWhiteNoise(View button2){
        Intent intent = new Intent(this, Music_Time_Selection.class);
        intent.putExtra("song", "whitenoise");
        startActivity(intent);
    }

    public void onWaterSounds(View button3){

        Intent intent = new Intent(this, Music_Time_Selection.class);
        intent.putExtra("song","water");
        startActivity(intent);
    }

    public void onNatureSounds(View button4){

        Intent intent = new Intent(this, Music_Time_Selection.class);
        intent.putExtra("song", "nature");
        startActivity(intent);
    }


}

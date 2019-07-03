package com.example.bluebalm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.content.Intent;

/**
 * First activity. used to select the music type. 
 */
public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
        }

        /**
         *
         * @param button used to select the instrumental music
         */
        public void onInstrumental(View button){

                Intent intent = new Intent(this, Music_Time_Selection.class);
                intent.putExtra("song", "instrumental");
                startActivity(intent);
        }

        /**
         * 
         * @param button2 used to select white noise
         */
        public void onWhiteNoise(View button2){
                Intent intent = new Intent(this, Music_Time_Selection.class);
                intent.putExtra("song", "whitenoise");
                startActivity(intent);
        }

        /**
         * 
         * @param button3 used to select water
         */
        public void onWaterSounds(View button3){

                Intent intent = new Intent(this, Music_Time_Selection.class);
                intent.putExtra("song","water");
                startActivity(intent);
        }

        /**
         * 
         * @param button4 used to select Nature sounds. 
         */
        public void onNatureSounds(View button4){

                Intent intent = new Intent(this, Music_Time_Selection.class);
                intent.putExtra("song", "nature");
                startActivity(intent);
        }


}

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onInstrumental(View button){

        Intent intent = new Intent(this, Music_Time_Selection.class);
        startActivity(intent);
    }

    public void onWhiteNoise(View button2){
        Intent intent = new Intent(this, Music_Time_Selection.class);
        startActivity(intent);
    }

    public void onWaterSounds(View button3){

        Intent intent = new Intent(this, Music_Time_Selection.class);
        startActivity(intent);
    }

    public void onNatureSounds(View button4){

        Intent intent = new Intent(this, Music_Time_Selection.class);
        startActivity(intent);
    }


}

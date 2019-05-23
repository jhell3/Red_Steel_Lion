package com.example.bluecalm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**code for spinner number one
        *Written by Whitney Chase*/
        Spinner mySpinner = (Spinner) findViewById(R.id.spinner1);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.minutes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        /**code for spinner number two
        *Written by Whitney Chase*/
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.minutes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        /**code for spinner number third
        *Written by Whitney Chase*/
        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.minutes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        /**code for spinner number fourth
        *Written by Whitney Chase*/
        Spinner mySpinner4 = (Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_expandable_list_item_1, getResources().getStringArray(R.array.minutes));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
    }
}

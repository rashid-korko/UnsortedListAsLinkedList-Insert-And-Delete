package com.example.unsortedlistaslinkedlist_insert_delete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void DoOperation(View v){

        Intent i2 = new Intent(this, Activity3.class);
        startActivity(i2);
    }
}
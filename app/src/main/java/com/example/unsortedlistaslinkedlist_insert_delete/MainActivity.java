package com.example.unsortedlistaslinkedlist_insert_delete;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


//here the first activity will begin
public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // this work when the user press the (start) button
    public void StartingApp(View v){

        Intent i = new Intent(this, Activity2.class);
        startActivity(i);
    }
}

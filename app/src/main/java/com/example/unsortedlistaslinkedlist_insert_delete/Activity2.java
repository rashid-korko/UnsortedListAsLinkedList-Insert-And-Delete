package com.example.unsortedlistaslinkedlist_insert_delete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Random;


//here the second activity will begin
public class Activity2 extends AppCompatActivity {
    public static LinkedList list = new LinkedList(null);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Random random = new Random();
        list.addToStart(Integer.toString(random.nextInt(100) + 1));
        list.addToStart(Integer.toString(random.nextInt(100) + 1));
        list.addToStart(Integer.toString(random.nextInt(100) + 1));
        list.addToStart(Integer.toString(random.nextInt(100) + 1));
    }

    // this work when the user press the (add to start) button
    public void AddToStart(View v){

        Intent i2 = new Intent(this, Activity3.class);
        String message = ((EditText)findViewById(R.id.editTextNumber)).getText().toString();
        list.addToStart(message);
        startActivity(i2);
    }

    // this work when the user press the (add to end) button
    public void AddToEnd(View v){

        Intent i2 = new Intent(this, Activity3.class);
        String message = ((EditText)findViewById(R.id.editTextNumber)).getText().toString();
        list.addToEnd(message);
        startActivity(i2);
    }

    // this work when the user press the (delete start) button
    public void DeleteStart(View v){

        Intent i2 = new Intent(this, Activity3.class);
        list.deleteStart();
        startActivity(i2);
    }

    // this work when the user press the (delete last) button
    public void DeleteLast(View v){

        Intent i2 = new Intent(this, Activity3.class);
        list.deleteLast();
        startActivity(i2);
    }

    // this work when the user press the (show the list) button
    public void ShowTheList(View v){

        Intent i2 = new Intent(this, Activity3.class);
        startActivity(i2);
    }
}
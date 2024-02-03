package com.example.unsortedlistaslinkedlist_insert_delete;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class Activity2 extends AppCompatActivity {
    public static LinkedList list = new LinkedList(null);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        //LinkedList list = new LinkedList(null);
        list.addToStart("50");
        list.addToStart("85");
        list.addToStart("65");
        list.addToStart("5");
    }

    public void AddToStart(View v){

        Intent i2 = new Intent(this, Activity3.class);
        String message = ((EditText)findViewById(R.id.editTextNumber)).getText().toString();
        list.addToStart(message);
        //i2.putExtra("cool", (Serializable) list);
        startActivity(i2);
    }

    public void AddToEnd(View v){

        Intent i2 = new Intent(this, Activity3.class);
        String message = ((EditText)findViewById(R.id.editTextNumber)).getText().toString();
        i2.putExtra("cool", message);
        startActivity(i2);
    }

    public void DeleteStart(View v){

        Intent i2 = new Intent(this, Activity3.class);
        String message = ((EditText)findViewById(R.id.editTextNumber)).getText().toString();
        i2.putExtra("cool", message);
        startActivity(i2);
    }

    public void DeleteLast(View v){

        Intent i2 = new Intent(this, Activity3.class);
        String message = ((EditText)findViewById(R.id.editTextNumber)).getText().toString();
        i2.putExtra("cool", message);
        startActivity(i2);
    }
}
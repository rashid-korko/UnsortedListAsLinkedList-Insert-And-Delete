package com.example.unsortedlistaslinkedlist_insert_delete;

import static com.example.unsortedlistaslinkedlist_insert_delete.Activity2.list;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    public Node current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        System.out.println("Current List: ");
        current = list.head;
        while (current != null) {
            int hi = current.data;
            String stringMessage = Integer.toString(hi);
            ((TextView)findViewById(R.id.textView2)).setText(stringMessage);
            current = current.next;
        }
        //displayList(list.head);

    }


    /*public static void displayList(Node head) {
        Node current = head;
        while (current != null) {
            current = current.next;
        }
    }*/
}
package com.example.awesomefat.csc300_spring2018_linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinkedList ll = new LinkedList();
        ll.addFront(2);
        ll.addFront(5);
        ll.addFront(7);
        ll.addEnd(9);
        ll.display();
        ScrollView sv = (ScrollView)(findViewById(R.id.scroll));
        LinearLayout lin = new LinearLayout(this);
        lin.setOrientation(LinearLayout.VERTICAL);
        sv.addView(lin);
        Button addFront = (findViewById(R.id.addFront));
        addFront.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
            //ll.addFront(payloadtxt.text);
            //TextView tv = new TextView(MainActivity);
            //tv.setText(payload.txt);
            //lin.addView(tv);
        });
        Button addEnd = findViewById(R.id.addEnd);
        addEnd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
            //ll.addEnd(payloadtxt.text);
            //ll.addFront(payloadtxt.text);
            //TextView tv = new TextView(MainActivity);
            //tv.setText(payload.txt);
            //lin.addView(tv);
        });






    }
}

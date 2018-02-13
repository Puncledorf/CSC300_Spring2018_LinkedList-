package com.example.awesomefat.csc300_spring2018_linkedlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText newNumberET;
    //private Button addFrontButton;
    //private Button addEndButton;
    private ViewGroup linkedListContainer;
    private LinkedList ll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.newNumberET = (EditText) this.findViewById((R.id.newNumberET));
        //this.addFrontButton = (Button) this.findViewById(R.id.button);
        //this.addEndButton = (Button) this.findViewById(R.id.button2);
        this.linkedListContainer = (ViewGroup) this.findViewById(R.id.linkedListContainer);

        this.ll = new LinkedList(this.linkedListContainer, this);
        ll.addFront(2);
        ll.addFront(5);
        ll.addFront(7);
        ll.addEnd(9);
        ll.display();
    }

    /*public void genericButtonOnClick(View v){
        if(v==this.addFrontButton){
            System.out.println("Add Front Button Pressed");
        }
        else {
            System.out.println("Add End Button Pressed")
        }
    }*/
    public void addFrontButtonClicked(View v)
    {
        String temp = this.newNumberET.getText().toString();
        this.newNumberET.setText("");
        this.ll.addFront(Integer.parseInt(temp));
        this.ll.display();
    }

    public void addEndButtonClicked(View v)
    {
        String temp = this.newNumberET.getText().toString();
        this.newNumberET.setText("");
        this.ll.addEnd(Integer.parseInt(temp));
        this.ll.display();
    }
    public void removeFrontButtonClicked (View v){
        try {
            int value = this.ll.removeFront();
            this.ll.display();

        }
        catch(Exception e){}

    }
    public void removeEndButtonClicked (View v){
        try {
            int value = this.ll.removeEnd();
            this.ll.display();
        }
        catch (Exception e){

        }
    }
    public void addIndexButtonClicked(View v){
        try {
            int value = this.ll.addIndex();
            this.ll.display();
        }
        catch (Exception e){

        }
    }
    public void removeIndexButtonClicked (View v){
        try {
            int value = this.ll.removeIndex;
            this.ll.display();
        }
        catch (Exception e){

        }
    }
}

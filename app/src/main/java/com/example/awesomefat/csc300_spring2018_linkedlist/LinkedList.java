package com.example.awesomefat.csc300_spring2018_linkedlist;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by awesomefat on 1/30/18.
 */

public class LinkedList
{
    private Node head;
    private ViewGroup linkedListContainer;
    private Context theContext;

    public LinkedList(ViewGroup linkedListContainer, Context theContext)
    {
        this.head = null;
        this.linkedListContainer = linkedListContainer;
        this.theContext = theContext;
    }

    public int removeFront() throws Exception{
        if(this.head != null) {
            Node node2Remove = this.head;
            this.head = this.head.getNextNode();
            node2Remove.setNextNode(null);
            this.linkedListContainer.removeViewAt(0);
            return node2Remove.getPayload();
        }
        else
        {
            Toast.makeText(this.theContext, "List is Empty", Toast.LENGTH_SHORT).show();
            throw new Exception("Empty List");
        }
    }

    public int removeEnd() throws Exception{
        if(this.head != null){
            Node node2Remove = this.head;
            while(node2Remove.getNextNode() != null) {
                node2Remove = node2Remove.getNextNode();
            }
            if(node2Remove == this.head){
                //we have a one list
                this.head = null;
                return  node2Remove.getPayload();
            }
            else {
                Node prevNode = this.head;
                while (prevNode.getNextNode() != node2Remove) {
                    prevNode = prevNode.getNextNode();
                }
                prevNode.setNextNode(null);
            }
            this.linkedListContainer.removeViewAt(this.linkedListContainer.getChildCount()-1);
            return node2Remove.getPayload();
        }
        else {
            //empty list
            Toast.makeText(this.theContext, "Empty List", Toast.LENGTH_SHORT).show();;
            throw new  Exception("Empty List");
        }
    }



    public void addIndex(int payload, int index) throws  Exception{
        int x = 0;
        Node node2Replace = this.head;
        Node nodeFollow = this.head;
        nodeFollow = nodeFollow.getNextNode();
        while(x < index && nodeFollow != null){
            node2Replace = node2Replace.getNextNode();
            nodeFollow = nodeFollow.getNextNode();
            x++;
        }
        if(nodeFollow.getNextNode() == null){
            this.addEnd(payload);
        }
        else{
            while(nodeFollow!=null){
                Node temp = node2Replace;
                node2Replace.getPayload() = payload;
                Node n = new Node(payload);

                //add to front of list
                if(this.head == null)
                {
                    this.head = n;
                }
                else
                {
                    //not dealing with the empty list
                    n.setNextNode(this.head);
                    this.head = n;
                }
                //up
                TextView tv = new TextView (this.theContext);
                tv.setText("" + payload);
                tv.setGravity(Gravity.CENTER);
                this.linkedListContainer.addView(tv,0);
            }
        }

    }


    public int removeIndex(int index) throws Exception{
        if(this.head != null){
            Node node2Remove = this.head;
            while(node2Remove.getNextNode() != null && index) {
                node2Remove = node2Remove.getNextNode();
            }
            if(node2Remove == this.head){
                //we have a one list
                this.head = null;
                return  node2Remove.getPayload();
            }
            else {
                Node prevNode = this.head;
                while (prevNode.getNextNode() != node2Remove) {
                    prevNode = prevNode.getNextNode();
                }
                prevNode.setNextNode(null);
            }
            this.linkedListContainer.removeViewAt(this.linkedListContainer.getChildCount()-1);
            return node2Remove.getPayload();
        }
        else {
            //empty list
            Toast.makeText(this.theContext, "Index does not exist", Toast.LENGTH_SHORT).show();;
            throw new  Exception("Index does not exist");
        }
    }




    public void addFront(int payload)
    {
        Node n = new Node(payload);

        //add to front of list
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            //not dealing with the empty list
            n.setNextNode(this.head);
            this.head = n;
        }
        //up
        TextView tv = new TextView (this.theContext);
        tv.setText("" + payload);
        tv.setGravity(Gravity.CENTER);
        this.linkedListContainer.addView(tv,0);

    }

    public void addEnd(int payload)
    {
        if(this.head == null)
        {
            this.addFront(payload);
        }
        else
        {
            this.head.addEnd(payload);
            /*
            Node n = new Node(payload);
            Node currNode = this.head;

            while(currNode.getNextNode() != null)
            {
                currNode = currNode.getNextNode();
            }
            //currnode is sitting at the last node
            currNode.setNextNode(n);
            */

            //update the interface
            TextView tv = new TextView(this.theContext);
            tv.setText(""+payload);
            tv.setGravity(Gravity.CENTER);
            this.linkedListContainer.addView(tv);
        }
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("Empty List");
        }
        else
        {
            //do stuff here
            this.head.display();
            System.out.println("");
            /*
            String answer = "";
            Node currNode = this.head;
            while(currNode != null)
            {
                answer = answer + currNode.getPayload() + " -> ";
                currNode = currNode.getNextNode();
            }
            System.out.println(answer);
            */

        }
    }

}

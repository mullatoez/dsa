package com.dsa.dsa.ds.stacksQueues.queue;

public class CustomQueue {
   private static class Node{
       private int data;
       private Node next;

       private Node(int data){
           this.data = data;
       }

       private Node head; // remove things from here
       private Node tail; // add things from the tail

       public boolean isEmpty(){
           return head == null;
       }

       public int peek(){
           if (head.isEmpty()){
               return -1;
           }

           return head.data;
       }

       public void add(int data){
           //create the node
           Node node = new Node(data);
           if (tail != null){
               tail.next = node;
           }

           tail = node;

           if (head == null){
               head = node;
           }
       }

       public int remove(){
           //get the data
           int data = head.data;
           head = head.next;

           if (head == null){
               tail = null;
               return -1;
           }

           return data;
       }
   }
}

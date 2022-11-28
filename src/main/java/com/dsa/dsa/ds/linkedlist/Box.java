package com.dsa.dsa.ds.linkedlist;

public class Box {
    int data;
    Box next;

    Box(int givenData) {
        this.data = givenData;
    }

    public static void main(String[] args) {
/*
Represent 6 - 3 - 4 - 2 - 1
 */

        Box six = new Box(6);
        Box three = new Box(6);
        Box four = new Box(6);
        Box two = new Box(6);
        Box one = new Box(6);

        six.next = three;
        three.next = four;
        four.next = two;
        two.next = one;
    }
}

class LinkedList{
    Box head;
    void addBoxNode(int data){
        Box box = new Box(data);

        if (head == null){
            head = box;
        }else {
            Box b = head;
            while (b.next != null){
                b = b.next;
            }
            b.next = box;
        }
    }
}


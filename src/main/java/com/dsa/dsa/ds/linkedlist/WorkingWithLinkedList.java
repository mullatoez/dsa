package com.dsa.dsa.ds.linkedlist;

import java.util.Iterator;

public class WorkingWithLinkedList {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(6);
        linkedList.insert(3);
        linkedList.insert(4);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.insertAt(12);

        linkedList.show();
    }

    /* 5 - 12 - 6 - 9 - 8 */
}

/*
 LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Rob");
        linkedList.add("Alex");
        linkedList.add("Jose");
        linkedList.add("Marcos");

        Object firstNode = linkedList.getLast();

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("Jose")){
                System.out.println(linkedList);
            }
        }

        System.out.println(firstNode);
 */

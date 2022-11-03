package com.dsa.dsa.ds.linkedlist;

public class SinglyLinkedListNode {
    private class Node {
        int val;
        SinglyLinkedListNode next;
        public Node(int item){
            val = item;
        }
    }

    Node head;

    void insertAtBeginning(int item){
        Node cur = new Node(item);
        head = cur;
    }
}

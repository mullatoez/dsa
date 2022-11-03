package com.dsa.dsa.ds.linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    void insert(int item){
        Node node = new Node(item);
        node.next = head;
        head = node;


    }
}

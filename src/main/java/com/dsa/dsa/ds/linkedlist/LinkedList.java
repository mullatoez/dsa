package com.dsa.dsa.ds.linkedlist;

public class LinkedList {

    /*
    5 -> 8 -> 9 -> 6 -> 3
    Node.head = 5
    Node.next = represents Node holding value 8 (address)
    Node.next.data = 8

    insert adds element at the end
     */

    Node head;

    public void insert(int data) {
        Node node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node node = new Node();
            node.data = data;
            node.next = null;

            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;
        }
    }

    public void deleteAt(int index){
        if (index == 0){
            head = head.next;
        }

        else {
            Node node = head;
            Node node1 = null;
            for (int i = 0; i < index - 1; i++){
                node = node.next;
            }
            node1 = node.next;
            node.next = node1.next;
            System.out.println("n1 " + node1.data);
            node1 = null;
        }
    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}

package com.dsa.dsa.ds.linkedlist;

public class LinkedList2 {
    Node head;
    Node tail;
    int size;

    public LinkedList2() {
        this.size = 0;
    }

    public void insertNodeAtFirstPlace(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head; // both head and tail i.e head is tail
        }

        size += 1;
    }

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

    public static void main(String[] args) {
        LinkedList2 list2 = new LinkedList2();
        list2.insert(12);
        list2.insert(120);
        list2.insert(1200);
        list2.insert(12000);
        list2.insertNodeAtFirstPlace(100);

        list2.show();

        System.out.println(list2.countNodes());
        Node node = new Node();
        node.data = 120000;
        System.out.println(list2.checkIfNodeExists(node));

    }

    public void show() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public int countNodes() {
        if (head == null) {
            return -1;
        }

        int count = 1;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count += 1;
        }

        return count;
    }

    public boolean checkIfNodeExists(Node node) {
        if (head == null) {
            return false;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        if (current.data == node.data)
            return true;

        return false;

    }
}

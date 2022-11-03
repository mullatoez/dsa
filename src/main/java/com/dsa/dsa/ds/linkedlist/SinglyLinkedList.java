package com.dsa.dsa.ds.linkedlist;

public class SinglyLinkedList {
    Node head, next = null;

    void insertNode(int item) {
        Node node = new Node(item);

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

    void printNodes() {
        if (head == null) {
            System.out.println("Empty list: ");
            return;
        }

        Node current = head;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        list.printNodes();
    }
}

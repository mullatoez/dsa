package com.dsa.dsa.ds.linkedlist;

public class DoublyLinkedList {
    /*
        A doubly-linked list has an additional pointer called previous pointer in its node apart
        from the data part and the next pointer as in the singly linked list.
     */
    class Node {
        int item;
        Node previous;
        Node next;

        public Node(int data) {
            this.item = data;
        }
    }

    //initially head and tail are set to null
    Node head, tail = null;

    //add a node to the list
    public void addNode(int data){
        Node newNode = new Node(data);

        //if list is empty, head and tail points to null
        if (head == null){
            head = tail = newNode;

            //head's previous points to null
            head.previous = null;

            //tail's next points to null
            tail.next = null;
        }else {
            //add newNode to the end of the list. tail.next = newNode
            tail.next = newNode;

            //our newNode.previous should point to tail
            newNode.previous = tail;

            //newNode becomes tail
            tail = newNode;

            //tails next point to null... is the last element
            tail.next = null;
        }
    }

    //print all nodes
    public void printNodes(){
        //Node current will point to head
        Node current = head;
        if (head == null){
            System.out.println("Doubly linked list is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list: ");
        while (current != null){
            //print each node and go to the next
            System.out.print(current.item + "  ");
            current = current.next;
        }
    }



    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);
        list.addNode(9);

        list.printNodes();
    }

}

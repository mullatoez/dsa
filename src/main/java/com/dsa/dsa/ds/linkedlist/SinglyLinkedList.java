package com.dsa.dsa.ds.linkedlist;

public class SinglyLinkedList {

    /*
    addFirst()	       Adds an item to the beginning of the list.
    addLast()	       Add an item to the end of the list
    removeFirst()	   Remove an item from the beginning of the list.
    removeLast()	   Remove an item from the end of the list
    getFirst()	       Get the item at the beginning of the list
    getLast()	       Get the item at the end of the list
    size()             Get the size of linked list
     */
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

    int getLastNode(){
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }

    int getFirstNode(){
        return head.data;
    }

    int getSecondNode(){
        return head.next.data;
    }

    /*int getSecondLastNode(){
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        return current.previous.data;
    }*/

    void insertRec(int item, int pos){

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);

        list.printNodes();
        System.out.println("Last Node: " + list.getLastNode());
        System.out.println("First Node: " + list.getFirstNode());
        System.out.println("Second Node: " + list.getSecondNode());

    }
}

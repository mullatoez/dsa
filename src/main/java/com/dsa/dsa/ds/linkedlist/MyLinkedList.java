package com.dsa.dsa.ds.linkedlist;

public class MyLinkedList {

    private class SingleNode {
        int val;
        SingleNode next;
    }

    SingleNode head;

    int get(int index) {
        int count = 0;
        SingleNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            if (cur.next.val == index) {
                return index;
            }
            count += 1;
        }
        return -1;
    }

    void addAtHead(int val) {
        SingleNode node = new SingleNode();
        node.val = val;

        node.next = head;
        head = node;
        /*SingleNode cur = head;
        cur.val = val;*/
    }

    void addAtIndex(int index, int val) {

    }

    void deleteAtIndex(int pos) {
        if (head == null) {
            System.out.println("Empty node");
            return;
        }

        SingleNode temp = head;
        //if head needs to be removed
        if (pos == 0) {
            head = temp.next;
            return;
        }

        // find the previous node to be deleted
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        SingleNode next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list

    }

    void addAtTail(int val) {
        SingleNode lastNode = getLastNode();
        lastNode.next.val = val;
    }

    SingleNode getLastNode() {
        SingleNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    void printList(){
        SingleNode node = head;
        while (node != null){
            System.out.println(node.val + " ");
            node = node.next;
        }
    }

    //Complexity Analysis
    /*
    Best Case : O(1) if given position is 1
    Average  & Worst Case : O(N)  if position given is size-1 then need to traverse till position not found.
    Space Complexity : O(1) no extra any space is required
     */

}

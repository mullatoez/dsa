package com.dsa.dsa.ds.stacksQueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(10);
        queue.add(100);
        queue.add(1000);
        queue.add(10000);

        System.out.println(queue.peek());//retrieves the head of queue but does not remove. returns null if empty

        System.out.println(queue.remove()); //retrives the head and deletes the head

        System.out.println(queue.poll()); // retrieves and deletes

        Deque<Integer> integers = new ArrayDeque<>();

    }
}

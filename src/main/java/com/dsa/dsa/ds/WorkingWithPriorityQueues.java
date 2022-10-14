package com.dsa.dsa.ds;

import java.util.Iterator;
import java.util.PriorityQueue;

public class WorkingWithPriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(4);
        numbers.add(2);

        numbers.offer(1);

        System.out.println("Priority Queue: " + numbers);

        /*int peekNum = numbers.peek();
        System.out.println("Peek Num: " + peekNum);

        //remove an element
        boolean isRemoved = numbers.remove(2);
        System.out.println("isRemoved: " + isRemoved);

        int num = numbers.poll();
        System.out.println(num);

        System.out.println("Priority Queue After: " + numbers);*/

        //iterate through an array
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
            System.out.print(", ");
        }

        boolean isFound = numbers.contains(4);
        System.out.print(isFound);
    }
}

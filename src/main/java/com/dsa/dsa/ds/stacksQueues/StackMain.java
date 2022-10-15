package com.dsa.dsa.ds.stacksQueues;

import com.dsa.dsa.ds.exceptions.StackException;

public class StackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(5);
        stack.push(12);
        stack.push(120);
        stack.push(1200);
        stack.push(12000);
        stack.push(120000);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

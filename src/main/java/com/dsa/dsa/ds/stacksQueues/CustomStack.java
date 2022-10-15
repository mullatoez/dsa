package com.dsa.dsa.ds.stacksQueues;

import com.dsa.dsa.ds.exceptions.StackException;

public class CustomStack {

    //STACK DS - Last In First Out

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int counter = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop from empty stack");
        }
       /* int removedElement = data[counter];
        counter--;*/

        return data[counter--];
    }

    int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from empty stack");
        }
        //returns what is at the top of stack
        return data[counter];
    }

    boolean push(int item) throws StackException {
        //notes
        /*
        checks if the array is full
        increments the counter
        add element to the new position of counter
         */
        if (isFull()) {
            throw new StackException("Cannot add. Stack is full!");
        }
        counter++;

        data[counter] = item;
        return true;
    }

    boolean isFull() {
        return counter == data.length - 1; // counter is at last index
    }


    boolean isEmpty() {
        return this.counter == -1;
    }


}

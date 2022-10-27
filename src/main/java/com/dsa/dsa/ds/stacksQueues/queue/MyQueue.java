package com.dsa.dsa.ds.stacksQueues.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    //store elements
    private List<Integer> data;

    private int p_start;

    public MyQueue() {
        this.data = new ArrayList<>();
        this.p_start = 0;
    }

    //insert element at the start
    public boolean enqueue(int data) {
        this.data.add(data);
        return true;
    }

    //delete an element from the queue
    public boolean dequeue(){
        if (data.isEmpty()){
            return false;
        }

        p_start++;
        return true;
    }

    //get the front data in queue
    public int getFront(){
        return data.get(p_start);
    }

    //check if queue is empty
    public boolean isEmpty(){
        return p_start >= data.size();
    }
}

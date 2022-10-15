package com.dsa.dsa.ds.stacksQueues;

import com.dsa.dsa.ds.exceptions.StackException;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    boolean push(int item) throws StackException {
        // we need to keep doubling the size when it's full
        if (this.isFull()) {
            int[] temp = new int[data.length * 2]; //create a new array of double size the new one
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}

package com.ekta.Session9;

public class DynamicQueue extends CircularQueue{
    @Override
    public void add(int item) {
        if (isFull()) {
            int[] temp = new int[data.length*2];
            for (int i = 0; i < size; i++) {
                temp[i] = data[(front+i)%data.length];
            }
            this.data = temp;
        }
        super.add(item);
    }
}

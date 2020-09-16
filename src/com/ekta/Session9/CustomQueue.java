package com.ekta.Session9;

public class CustomQueue {
    protected int[] data;
    protected int end;
    private final int DEFAULT_SIZE=10;

    CustomQueue() {
        data = new int[DEFAULT_SIZE];
        end = -1;
    }

    CustomQueue(int size) {
        data = new int[size];
        end = -1;
    }

    public boolean isFull() {
        return end == this.data.length-1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public void add(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.data[++end] = item;
    }

    public Integer remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        int temp = this.data[0];
        for (int i = 0; i < end; i++) {
            this.data[i] = this.data[i+1];
        }
        return temp;
    }
}

package com.ekta.Session9;

public class CircularQueue {
    int[] data;
    int front, end;
    int size;
    private final int DEFAULT_SIZE = 10;

    CircularQueue() {
        data = new int[DEFAULT_SIZE];
        front = 0;
        end = -1;
        size = 0;
    }

    CircularQueue(int initialSize) {
        data = new int[initialSize];
        front = -1;
        end = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.end = (end + 1) % data.length;
        this.data[end] = item;
        size++;
    }

    public Integer remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        int temp = data[front];
        this.front = (front+1)% data.length;
        size--;
        return temp;
    }
 }

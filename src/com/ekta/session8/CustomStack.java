package com.ekta.session8;

public class CustomStack {
    protected int[] data;
    private final int DEFAULT_SIZE = 10;
    protected int top = -1;

    public CustomStack () {
        this.data = new int[DEFAULT_SIZE];
    }

    public CustomStack (int size) {
        this.data = new int[size];
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        this.data[++top] = item;
    }

    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return null;
        }
        return this.data[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == this.data.length - 1;
    }

    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return this.data[top];
    }
}

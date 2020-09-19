package com.ekta.session10;

public class CustomLinkedList {
    Node head, tail;
    int size = 0;

    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertAtFirst(int val) {
        Node node = new Node(val, head);
        head = node;
        if (size == 0) {
            tail = node;
        }
        size++;
    }

    public void insertAtLast(int val) {
        if (size == 0) {
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public Integer deleteAtFirst() {
        if (size == 0) {
            return null;
        }
        int temp = head.value;
        head = head.next;
        size--;
        if (size == 0) {
            tail = null;
        }
        return temp;
    }

    public Integer deleteAtLast() {
        if (size <= 1) {
            return deleteAtFirst();
        }
        Node node = head;
        while (node.next != tail) {
            node = node.next;
        }
        int temp = tail.value;
        tail = node;
        tail.next = null;
        size--;
        return temp;
    }

    public int mid() {
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        int temp = slow.value;
        return temp;
    }

    public boolean cycleDetection() {
        if (size < 3) {
            return false;
        }
        Node slow = head, fast = head.next.next;
        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
               return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
//        insertAtLast(4);
//        tail.next = head;
    }

}

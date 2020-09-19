package com.ekta.session10;

public class LinkedListclient {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.insertAtFirst(2);
        list.insertAtFirst(5);
//        list.display();
        list.insertAtLast(3);
        list.insertAtLast(8);
//        list.display();
        list.deleteAtLast();
//        System.out.println("Mid: " + list.mid());
        list.display();
        System.out.println(list.cycleDetection());
    }
}

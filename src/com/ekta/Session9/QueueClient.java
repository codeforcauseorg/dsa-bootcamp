package com.ekta.Session9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClient {
    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue();

        for (int i = 0; i < 1000; i++) {
            queue.add(i);
        }

        System.out.println(queue.remove());

    }
}

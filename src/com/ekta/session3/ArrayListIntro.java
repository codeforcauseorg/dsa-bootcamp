package com.ekta.session3;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list);
        Collections.sort(list);
    }
}

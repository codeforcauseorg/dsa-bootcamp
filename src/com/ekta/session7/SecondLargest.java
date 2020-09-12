package com.ekta.session7;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();

            if (a > b && a > c) {
                System.out.println(Math.max(b,c));
            } else if(b > a && b > c) {
                System.out.println(Math.max(a,c));
            } else {
                System.out.println(Math.max(a,b));
            }
        }
    }
}

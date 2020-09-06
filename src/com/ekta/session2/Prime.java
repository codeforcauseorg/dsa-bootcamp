package com.ekta.session2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        primeNumber(n);
    }

    public static void primeNumber(int n) {
        if (n == 0 || n == 1) {
            System.out.println("Not prime");
            return;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}

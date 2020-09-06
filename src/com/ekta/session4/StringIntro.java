package com.ekta.session4;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = "naman";
        StringBuilder s1 = new StringBuilder("naman");
//        substrings(str);
//        System.out.println(pallindrome(str));
        for (int i = 0; i < 1000000; i++) {
            s1.append("a");
        }
        System.out.println(s1);
    }

    private static boolean pallindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    private static void substrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length()+1; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}

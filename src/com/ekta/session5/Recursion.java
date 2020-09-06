package com.ekta.session5;

public class Recursion {
    public static void main(String[] args) {
        int n = 5;
//        print(5);
        System.out.println(factorial(5));
        int[] nums = {2,9,4,8,2,0,1};
        System.out.println(find(nums, 3, 0));
    }

    private static boolean find(int[] nums, int elt, int ind) {
        if (ind == nums.length) {
            return false;
        }
        if (nums[ind] == elt) {
            return true;
        }

        return find(nums, elt, ind+1);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    public static void printInc(int n) {
        if (n == 0) {
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}

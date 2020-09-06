package com.ekta.session3;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = {1,2,4,6,8,12};
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] =s.nextInt();
//        }

//        System.out.println(Arrays.toString(nums));
        int elt = 3;
//        int ind = linearSearch(nums, elt);
//        int ind = binarySearch(nums, elt);
//        System.out.println(ind);
        System.out.println(maxElement(nums));
    }

    public static int linearSearch(int[] nums, int elt) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == elt) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int elt) {
        int start = 0, end = nums.length -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == elt) {
                return mid;
            } else if (nums[mid] < elt) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int maxElement(int[] nums) {
        int maxInd = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[maxInd] < nums[i]) {
                maxInd = i;
            }
        }

        return maxInd;
    }
}

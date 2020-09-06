package com.ekta.session5;

public class StringRecursion {
    public static void main(String[] args) {
        String str = "abc";
        subseq("", str);
    }

    public static void subseq(String proc, String unproc) {
        if (unproc.isEmpty()) {
            System.out.println(proc);
            return;
        }

        char ch = unproc.charAt(0);
        unproc = unproc.substring(1);

        subseq(proc+ch, unproc);
        subseq(proc, unproc);
    }
}

package com.yash.corejava.dailypractice;

public class OverloadMainMethodDemo {

    public static void main1(String[] args) {

        System.out.println("This Is Main Method 1");

    }

    public static void main2(String[] args) {

        System.out.println("This Is Main Method 2");
    }

    public static void main(String[] args) {

        OverloadMainMethodDemo d1 = new OverloadMainMethodDemo();

        d1.main1(args);
        d1.main2(args);
    }
}

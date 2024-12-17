package com.yash.corejava.multithreading;

public class MultiThreadingDemo extends Thread{

    public static void main(String[] args) {

        MultiThreadingDemo d = new MultiThreadingDemo();

        d.setPriority(9);
        System.out.println(d.getPriority());
        d.start();
        System.out.println(d.isDaemon());
        System.out.println(d.isAlive());
        System.out.println(d.isInterrupted());
        d.interrupt();
        System.out.println(d.isInterrupted());


    }
}

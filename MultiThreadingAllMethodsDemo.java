package com.yash.corejava.multithreading;

public class MultiThreadingAllMethodsDemo extends  Thread{

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        System.out.println("Run Method");
        for (int i=1;i<=10;i++)
        {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) throws IllegalThreadStateException, InterruptedException {

        MultiThreadingAllMethodsDemo d1 = new MultiThreadingAllMethodsDemo();
        MultiThreadingAllMethodsDemo d2 = new MultiThreadingAllMethodsDemo();

        d1.setName("Thread d1");
        d2.setName("Thread d2");
        // To check Thread d1 is alive or not before starting
        System.out.println("Thread d1 is alive or not "+d1.isAlive());
        d1.start();
        // To check Thread d1 is alive or not after starting
        System.out.println("Thread d1 is alive or not "+d1.isAlive());
        // To check Thread d1 is interrupted or not
        System.out.println("Thread d1 is interrupted or not "+d1.isInterrupted());
        // To check Thread d1 is interrupted or not after calling interrupted() method
        d1.interrupt();
        System.out.println("Thread d1 is interrupted or not "+d1.isInterrupted());
        // To check current thread is Daemon thread or not
        System.out.println("Thread d1 is daemon or not "+d1.isDaemon());
        // To make current thread as a Daemon thread
      //  d1.setDaemon(true);
        System.out.println("Thread d1 is daemon or not "+d1.isDaemon());
        d2.start();

        // Get current Thread names
        System.out.println(Thread.currentThread().getName());

       // d2.yield();
        System.out.println(Thread.currentThread().getName());
      //  d2.sleep(10000);

     //   d2.wait();
      //  d2.notify();
    }
}

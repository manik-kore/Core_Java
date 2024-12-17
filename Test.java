package com.yash.corejava.multithreading;

public class Test extends Thread{

    @Override
    public void run() {

//        for(int i=1;i<=5;i++)
//        {
//            System.out.println(i);
//        }
//
//        try
//        {
//            Thread.sleep(1000);
//        }
//        catch (InterruptedException e)
//        {
//            throw new RuntimeException("Interrupted "+e);
//        }

        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.isAlive());
    }

    public static void main(String[] args) throws InterruptedException{

        Test t1 = new Test();
      //  Test t2 = new Test();
        t1.start();
        t1.join(1000);

        System.out.println(t1.getName());
        System.out.println(t1.isAlive());

//        try
//        {
//            t1.interrupt();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
    }
}

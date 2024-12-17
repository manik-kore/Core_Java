package com.yash.corejava.multithreading;

public class JoinMethodDemo extends Thread{

//    static Thread t1 = new Thread();
//    static Thread t2 = new Thread();

    static JoinMethodDemo d1 = new JoinMethodDemo();
    static JoinMethodDemo d2 = new JoinMethodDemo();


    @Override
    public void run() {

        d1.setName("Even Thread");
        System.out.println(d1.getName());
        for(int i=1;i<=20;i++)
        {
            if(i%2==0)
            {
                System.out.println("All Even Numbers Are -: "+i);
            }
        }

        System.out.println("=============================================");

        d2.setName("Odd Thread");
        System.out.println(d2.getName());

        for(int i=1;i<=20;i++)
        {
            if(i%2!=0)
            {
                System.out.println("All Odd Numbers Are -: "+i);
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {

//        JoinMethodDemo d1 = new JoinMethodDemo();
//        JoinMethodDemo d2 = new JoinMethodDemo();

        JoinMethodDemo.d1.start();
        JoinMethodDemo.d1.join();
        JoinMethodDemo.d2.start();

//        t1.start();
//        t2.start();
//        t2.join();


    }
}

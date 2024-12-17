package com.yash.corejava.multithreading;

import java.util.*;

public class RandomNumberIdentifierDemo extends Thread{

    @Override
    public void run() {

        Random rand = new Random();
        int num=0;

        Set<Integer> set = new TreeSet<>();
        List<Integer>list = new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            num =(-5)+rand.nextInt(20);
            list.add(num);
            System.out.println(num);

        }
        System.out.println(list);

        System.out.println("==============================");

        System.out.println("Below Are Positive Even Numbers");
        for(Integer i:list)
        {
            if(i>0 && i%2==0)
            {
                System.out.println(i);
            }
        }

        System.out.println("==============================");

        System.out.println("Below Are Negative Even Numbers");

        for(Integer i:list)
        {
            if(i<0 && i%2==0)
            {
                System.out.println(i);
            }
        }
        System.out.println("==============================");

        System.out.println("Below Are Positive Odd Numbers");
        for(Integer i:list)
        {
            if(i>0 && i%2!=0)
            {
                System.out.println(i);
            }
        }

        System.out.println("==============================");
        System.out.println("Below Are Negative Odd Numbers");

        for(Integer i:list)
        {
            if(i<0 && i%2!=0)
            {
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {


      RandomNumberIdentifierDemo d1 = new RandomNumberIdentifierDemo();
        RandomNumberIdentifierDemo d2 = new RandomNumberIdentifierDemo();

      d1.start();



    }
}

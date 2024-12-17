package com.yash.corejava.multithreading;

import java.util.Stack;

public class StackDemo extends Thread{

    @Override
    public void run() {

        for (int i=1;i<5;i++) {

            System.out.println("run method");

        }


            Stack<Integer> st = new Stack<>();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(25);
            st.push(35);
            st.pop();

            System.out.println(st);


    }

    public static void main(String[] args) {


        StackDemo t = new StackDemo();

        t.start();


    }
}

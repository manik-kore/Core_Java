package com.yash.corejava.exception;

public class ExceptionDemo {

    public static void main(String[] args) {

        int salary=-10000;
        try
        {
            if(salary==0 || salary<0)
            {
                throw new MyException("Salary should not be zero or negative");
            }
            else if(salary>40000 && salary>0)
            {
                System.out.println("This is Software Engineer Salary");
            }
            else
            {
                System.out.println("This is salary of non Engineer");
            }

        }
        catch (MyException e)
        {
            e.printStackTrace();
        }
        System.out.println("Bye");

    }
}

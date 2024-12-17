package com.yash.corejava.exception;

public class ChainedExceptionDemo {

    public static void main(String[] args) {

        try
        {
            ArithmeticException a = new ArithmeticException("Exception");
            a.initCause(new NullPointerException());
            throw a;

        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println(e.getCause());
        }

    }
}

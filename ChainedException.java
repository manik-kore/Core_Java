package com.yash.corejava.exception.throwsdemo;

public class ChainedException {

    public static void demo()
    {
        NullPointerException n = new NullPointerException("Current Exception");
        n.initCause(new ArithmeticException("Root Cause Of Current Exception"));
        throw n;
    }

    public static void main(String[] args) {

        try
        {
            demo();
        }
        catch (NullPointerException e)
        {
            System.out.println("Caught-: "+e);
            System.out.println("Cause Of Current Exception-: "+e.getCause());
        }
    }
}

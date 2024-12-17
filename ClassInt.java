package com.yash.corejava.sumofints;

public class ClassInt {

    private int sum,i,j;

    public ClassInt() {

        sum=0;
    }

    public int getSum() {
        return sum;
    }

    public void addNumber(int i,int j )
    {
        sum = getSum()+i+j;
        System.out.println("Sum Of Ints Is-: "+sum);
    }



}

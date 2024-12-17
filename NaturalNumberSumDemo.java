package com.yash.corejava;

import java.util.Scanner;

public class NaturalNumberSumDemo {

    public static int calculateSum(int number)
    {
        int sum=0;
        for(int i=1;i<=number;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum=sum+i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        int num=15;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int number = sc.nextInt();

        int result = calculateSum(number);

        System.out.println("Sum Of First Natural Number Divisible By 3 Or 5 Is-: "+result);

    }
}

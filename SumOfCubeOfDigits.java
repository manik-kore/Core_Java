package com.yash.corejava;

import java.util.Scanner;

public class SumOfCubeOfDigits {

    public static int sumOfCubeOfDigits(int num)
    {
        int rem,sum=0;
        while(num!=0)
        {
            rem = num%10;
            sum=sum+(rem*rem*rem);

            num=num/10;
        }

        return sum;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n = sc.nextInt();

        //int num =15;

        int result = sumOfCubeOfDigits(n);



        System.out.println(result);




    }
}

package com.yash.corejava.arrays;

import java.util.Scanner;

public class MultiplyToArrayByNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        int arr[] = new int[5];
        int res[] = new int[5];
        int i,j,result=1;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("Enter Array Number To Multiply");
            int num=sc.nextInt();

            for(j=0;j<arr.length;j++)
            {
                res[j]=num*arr[j];
            }


            for(int r:res)
            {
                System.out.println("Result Aftrer Multiplication By "+num+" Is-: "+r);
            }
        }
    }



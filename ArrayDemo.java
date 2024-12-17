package com.yash.corejava.arrays;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements ");
        int arr[] = new int[5];
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
             arr[i] =sc.nextInt();
        }

     //   int max=arr[0];
        int min=arr[0];
        for(int j=0;j<arr.length;j++)
        {
           // System.out.println(arr[j]);

           // sum=sum+arr[j];
//            if(arr[j]>max)
//            {
//                max=arr[j];
//            }
            if(arr[j]<min)
            {
                min=arr[j];
            }
        }
        System.out.println(sum);
        //  System.out.println(max);
        System.out.println("Minimum Number Of Array Is-: "+min);
    }
}

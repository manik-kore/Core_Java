package com.yash.corejava.arrays;

import java.util.Scanner;

public class FirstTwoSmallestNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements ");
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i] =sc.nextInt();
        }

//        int min1=arr[0];
//
//        // 1 2 3
//        for(int j=0;j<arr.length;j++)
//        {
//            if(arr[j]<min1)
//            {
//
//                min1=arr[j];
//
//            }
//        }

//        System.out.println(min1);
        int temp,j,k=0;
        for( j=0;j<arr.length;j++)
        {
            for( k=j+1;k<arr.length;k++)
            {
                if(arr[j]<arr[k])
                {
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }

        }
        System.out.println(arr[k-1]);
        System.out.println(arr[k-2]);

    }
}

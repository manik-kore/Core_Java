package com.yash.corejava.arrays;

import java.util.Scanner;

public class CopyOfArrayInReverseOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        int arr1[] = new int[5];

        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }


     //   int arr1[] = {10,24,36,42};
        int arr2[] = new int[5];

        for(int i=arr1.length-1;i>=0;i--)
        {

                arr2[i]=arr1[(arr1.length-1)-i];
        }

        for(int a2:arr2)
        {
            System.out.println(a2);
        }
    }
}

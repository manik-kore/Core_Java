package com.yash.oopsproject;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        // Assigning one array size to another array. It is possible.

//        int arr1[]=new int[5];
//        int arr2[]=new int[15];
//        arr1 =arr2;
//
//        for(int i=0;i<arr1.length;i++)
//        {
//            System.out.println(i);
//        }

           // Copying array

//        int a[] ={10,20,30,40,50};
//        int b[]= new int[5];
//
//       b= Arrays.copyOf(a,5);
//
//       for(int i=0;i<b.length;i++)
//       {
//           System.out.println(b[i]);
//       }

        int a[] ={10,20,30,40,50};

        System.out.println(Arrays.binarySearch(a,50));
    }
}

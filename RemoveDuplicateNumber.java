package com.yash.corejava.arrays;

import java.util.Scanner;

public class RemoveDuplicateNumber {

    public static void main(String[] args) {

      //  int arr[] = {12,30,15,16,30};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }


        int i,j;
        for(i=0;i<arr.length;i++) {
            boolean flag = false;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(arr[i]);
            }


        }

    }
}

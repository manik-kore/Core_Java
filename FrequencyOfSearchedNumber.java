package com.yash.corejava.arrays;

import java.util.Scanner;

public class FrequencyOfSearchedNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        int arr[] = new int[10];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Search Array Numbers");
        int num =sc.nextInt();
        int cnt=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}

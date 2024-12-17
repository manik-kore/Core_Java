package com.yash.corejava.arrays;

import java.util.Scanner;

public class PairsOfSum {

    public static void main(String[] args) {

        //int a[] = {2,4,1,5,9,7};

        int arr[] =new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
       for(int i=0;i<arr.length;i++)
       {
           arr[i]=sc.nextInt();
       }

        int sum=0,cnt=0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==6 || arr[i]+arr[j]==9)
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

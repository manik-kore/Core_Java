package com.yash.corejava.arrays;

import java.util.Scanner;

public class FirstNonRepeatingNumber {

    public static void main(String[] args) {

        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int cnt=0,i,j;

        for(i=0;i<arr.length;i++)
        {
             cnt=0;
            for(j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                }
            }

            if(cnt==1)
            {
                System.out.println("First Non Repeating Number Is-: "+arr[i]);
                break;
            }
        }

    }
}

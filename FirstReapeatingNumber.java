package com.yash.corejava.arrays;

import java.util.Scanner;

public class FirstReapeatingNumber {

    public static void main(String[] args) {

      //  int arr[] = {1,2,3,2,5,2};
         int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int cnt=0,i;
        for( i=0;i<arr.length;i++)
        {
            cnt=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;

                }

            }
            if(cnt>1)
            {
                System.out.println("First Repeating Integer Is-: "+arr[i]);
                break;
            }
        }

    }
}

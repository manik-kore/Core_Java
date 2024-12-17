package com.yash.corejava.arrays;

import java.util.Scanner;

public class SortingOfArray {

    public static void main(String[] args) {

        int arr[] = {22,46,4,8,70,26};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        int a[] = new int[5];

        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        int temp=0;

        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for(int ar:a)
        {
            System.out.println(ar);
        }

    }
}

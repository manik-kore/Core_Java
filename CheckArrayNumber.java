package com.yash.corejava.arrays;

import java.util.Scanner;

public class CheckArrayNumber {

    public static void main(String[] args) {

      //  int arr[] = {1,5,10,21,77};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Numbers");
        int arr[] = new int[5];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int i;

        System.out.println("Enter Number To Find");
        int num = sc.nextInt();
        boolean flag=false;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                flag=true;
                System.out.println("Index Of Required Number Is-: "+ i);
                break;
            }
        }
        if(flag==false)
        {
            System.out.println("-1");
        }




    }
}

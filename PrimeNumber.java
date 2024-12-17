package com.yash.corejava;

import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {

      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter Any Number");
      //  int num = sc.nextInt();
      //  int n = 100;
        int sum=0;
        int flag=0;
        for(int i=2;i<=100;i++)
        {
            flag=0;
            for(int j=1;j<=100;j++)

            if(i%j==0 && i/1==i)
            {
                flag++;
             //   break;
            }

            if(flag==2)
            {
                System.out.println(i);
                sum=sum+i;

            }

        }

        System.out.println("Sum Of All Prime Numbers Is-: "+sum);

        }

}



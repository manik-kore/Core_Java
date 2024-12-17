package com.yash.corejava;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n = sc.nextInt();

        int temp,len=0;
        temp=n;
        while(temp!=0)
        {
            temp=temp/10;
            len=len+1;
        }

         int t2=n,rem,arm=0;

        while(t2!=0)
        {
            rem=t2%10;
            int mul=1;
            for(int i=1;i<=len;i++)
            {
                mul=mul*rem;
            }
            arm=arm+mul;
            t2=t2/10;

        }

        if(arm==n)
        {
            System.out.println(n+" Is Armstrong Number");

        }
        else {

            System.out.println(n+" Is not Armstrong Number");
        }




    }
}

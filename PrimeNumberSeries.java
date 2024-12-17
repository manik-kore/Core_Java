package com.yash.corejava;

import java.util.Scanner;

public class PrimeNumberSeries {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();
        int cnt=0,i;
        if(num==1 || num==0)
        {
            System.out.println("Invalid Numbers");
        }
        for(i=2;i<num;i++)
        {
            cnt=0;
            for(int j=1;j<num;j++) {
                if (i % j == 0 && i % 1 == 0) {
                    cnt++;

                }

            }
            if(cnt==2)
            {
                System.out.println(i);
            }

        }

    }
}

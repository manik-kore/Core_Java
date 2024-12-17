package com.yash.corejava;

import javax.sql.rowset.spi.SyncFactory;
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number");
        int num = sc.nextInt();
        int n1=0, n2=1;
        int sum;
        System.out.print(n1+" "+n2);
           for(int i=2;i<num;i++)
           {
                  sum=n1+n2;
                  System.out.print(" "+sum);
                  n1=n2;
                  n2=sum;
           }


    }
}

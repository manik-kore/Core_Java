package com.yash.corejava;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          System.out.println("Enter Any Number");
          int n = sc.nextInt();


        int rem,sum=0,temp;
        temp=n;
        while (n!=0)
        {
            rem = n%10;
            sum=(sum*10)+rem;
            n=n/10;
        }

        if(temp==sum)
        {
            System.out.println(temp+" Is Palindrome");
        }
        else {

            System.out.println(temp+" Is Not Palindrome");
        }
    }
}

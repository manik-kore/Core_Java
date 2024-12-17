package com.yash.corejava;

public class PerfectNumber {


    public static void main(String[] args) {

        int sum = 0, num = 100;
        for (int i = 1; i <=num; i++) {

              for(int j=1;j<=i/2; j++)
            {
                if (i % j == 0) {
                    sum = sum + j;
                }

            }

            if(sum==i)
            {
                System.out.println(i+" Is Perfect Number");
            }
            else {

                System.out.println(i+" Is Not Perfect Number");
            }

            sum=0;
        }

        System.out.println(sum);


    }
}

package com.yash.corejava.arrays;

public class SumOfExcludingTwoScceedingNumbers {

    public static void main(String[] args) {

        int arr[] = {10,3,6,1,2,7,9,10};

        boolean flag =false;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]==6)
            {
                flag = true;
            }
            else if(!flag)
            {
                sum=sum+arr[i];
            }
            if(arr[i]==7 && flag==true)
            {
                flag=false;
            }
        }

        System.out.println("Sum Of Excluding Succeeding Numbers Is-: "+sum);

    }
}

package com.yash.corejava.arrays;

import java.util.Scanner;

public class CarParking {

    int car1[][] ={{22,44,67,70,24},{10,12,0,0},{5,0,8},{34,0},{0}};

    public void showAvailability()
    {
        int i,j;
       for(i=0;i<car1.length;i++)
       {

           for(j=0;j<car1[i].length;j++)
           {
               if(car1[i][j]==0)
               {
                   System.out.println("Parking Available At Places-: "+i+" "+j);
                   break;
               }

           }


       }


    }

    public void parkCar(Car car)
    {
        int j,cnt=0;
        for(int i=0;i<car1.length;i++) {

              cnt=0;
            for (j = 0; j < car1[i].length; j++) {
                if (car1[i][j] == 0) {
                    car1[i][j] = car.setTokenNo(car.getTokenNo());
                    cnt++;

                }
            }
            if(cnt==1)
            {
                System.out.println("Your Car Is Parked At-: "+i+" "+j);
                break;
            }

        }

    }

    public void getCar(Car car)
    {

    }
}

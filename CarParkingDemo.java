package com.yash.corejava.arrays;

import java.util.Scanner;

public class CarParkingDemo {

    public static void main(String[] args) {

        Car c1 = new Car(1,"A",101);
        Car c2 = new Car(2,"B",102);
        Car c3 = new Car(3,"C",103);
        Car c4 = new Car(4,"D",104);

        Car c = new Car();
        CarParking cp = new CarParking();


        System.out.println("Welcome To Car Parking Simulation.");
        System.out.println("Enter Your Choice..... 1] Check Parking Availability 2] Park Your Car 3] Get Your Car");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option<4)
        {
            if(option==1)
            {
                cp.showAvailability();

            } else if (option==2)
            {
                cp.parkCar(new Car());
            } else if (option==3)
            {
               cp.getCar(c);
            }
            else
            {
                System.out.println("Invalid Option");
            }

        }




    }
}

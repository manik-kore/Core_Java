package com.yash.corejava.practice19sep;

public class Patient {

    String patientName;
    double height;
    double weight;
    double BMI;
    public double computeBMI(double height,double weight)
    {
        BMI=weight/(height*height);
        return BMI;
    }

    public static void main(String[] args) {

        Patient p = new Patient();
        System.out.print("Patient BMI Is-: ");
        System.out.print(p.computeBMI(1.7,60));
        System.out.print(" Kg/meter square");
    }
}

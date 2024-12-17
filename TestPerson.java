package com.yash.corejava.salarycalculation;

public class TestPerson {

    public static void main(String[] args) {

        Employee e = new Employee(12,50000);
        UnEmployed ue = new UnEmployed(10,40000);
        SelfEmployed se = new SelfEmployed(8,30000);



        System.out.println("Employee Salary Is-: "+e.calculateSalary());
        System.out.println("UnEmployed Salary Is-: "+ue.calculateSalary());
        System.out.println("Self Employed Salary Is-: "+se.calculateSalary());

        CalculateSalary cs = new CalculateSalary("Employee",12,50000);
        System.out.println("Employee Salary Is-: "+cs.calculateSalary());


    }
}

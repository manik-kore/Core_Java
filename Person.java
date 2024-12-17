package com.yash.corejava.salarycalculation;

public class Person {

     double tax,salary;

     public Person(double tax, double salary) {
         this.tax = tax;
         this.salary = salary;
     }

    public Person() {

    }

    private void calculateSalary()
    {
        {
            salary = salary-(salary*(tax/100));
            System.out.println("Calculated Salary Is-: "+salary);
        }
    }

}


class Employee extends Person
{
    double tax,salary;

    public Employee(double tax, double salary) {
      //  super();
        this.tax = tax;
        this.salary = salary;
    }

    public double calculateSalary()
    {
        salary = salary-(salary*(tax/100));
        return salary;
    }
}

class UnEmployed extends Person
{
    double tax,salary;

    public UnEmployed(double tax, double salary) {
        this.tax = tax;
        this.salary = salary;
    }

    public double calculateSalary()
    {
        salary = salary-(salary*(tax/100));
        return salary;
    }

}

class SelfEmployed extends Person
{
    double tax,salary;

    public SelfEmployed(double tax, double salary) {
        this.tax = tax;
        this.salary = salary;
    }

    public double calculateSalary()
    {
        salary = salary-(salary*(tax/100));
        return salary;
    }
}

class CalculateSalary
{
    String empType;
    double tax,salary;

//    Employee e;
//    UnEmployed ue;
//    SelfEmployed se;

    public CalculateSalary(double tax, double salary) {
        this.tax = tax;
        this.salary = salary;
    }

    public CalculateSalary(String empType, double tax, double salary) {
        this.empType = empType;
        this.tax = tax;
        this.salary = salary;
    }

    public double calculateSalary()
    {
        salary = salary-(salary*(tax/100));
        return salary;
    }

}
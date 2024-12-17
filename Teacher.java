package com.yash.corejava.inheritance;

public class Teacher extends Person{

    double salary;
    String subject;

    public Teacher(double salary, String subject) {
        super();
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

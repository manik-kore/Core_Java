package com.yash.corejava.dailypractice;

public class Employee {

    int empId;
    String EmpName;

    public Employee() {
    }

    public Employee(int empId, String empName) {
        this.empId = empId;
        EmpName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", EmpName='" + EmpName + '\'' +
                '}';
    }
}

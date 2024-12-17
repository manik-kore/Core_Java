package com.yash.corejava.inheritance;

public class Student extends  Person{

    int studentId;

    public Student() {

    }

    public Student(int studentId) {
        this.studentId = studentId;
    }



    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

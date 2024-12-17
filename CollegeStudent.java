package com.yash.corejava.inheritance;

public class CollegeStudent extends Student{

    String collegeName;
    int year;

    public CollegeStudent(String collegeName, int year) {
        super();
        this.collegeName = collegeName;
        this.year = year;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }




}

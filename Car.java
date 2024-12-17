package com.yash.corejava.arrays;

import java.util.Random;

public class Car {

    private int regNo;
    private String ownerName;
    private int tokenNo;

    Random rd = new Random();
    public Car() {
    }

    public Car(int regNo, String ownerName, int tokenNo) {
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.tokenNo = tokenNo;
    }


    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTokenNo() {


        return tokenNo;
    }

    public int setTokenNo(int tokenNo) {
        tokenNo = rd.nextInt(4000);
       // this.tokenNo = tokenNo;
       return tokenNo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "regNo=" + regNo +
                ", ownerName='" + ownerName + '\'' +
                ", tokenNo=" + tokenNo +
                '}';
    }
}

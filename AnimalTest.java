package com.yash.corejava.inheritance;

public class AnimalTest {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.eat();
        a.sleep();



        System.out.println("================================================================================");

        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();

    }
}

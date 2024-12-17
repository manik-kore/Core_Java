package com.yash.corejava.dailypractice;

public class ThisKeywordDemo {

         int id;
         String name;

         B a;

    public ThisKeywordDemo() {

        System.out.println("Default Constructor");
    }

    public ThisKeywordDemo(int id, String name) {
        this();  // this keyword is used to invoke current class constructor.
        this.id = id;
        this.name = name; // this keyword is used to invoke current class instance variables


    }

    public ThisKeywordDemo(B a)
    {
        this.a = a;
    }
    public void m3(ThisKeywordDemo obj)
    {
        System.out.println("Object has passed");
    }

    public void objectCall()
    {
        m3(this); //  this keyword is used to pass as an argument
    }
    public void display()
    {
        System.out.println("Id Is-: "+id+" Name Is-: "+name);
    }

    public void m1(){

        System.out.println("This Is M1 Method Invoked By Using this keyword.");
    }

    public void m2(){

        System.out.println("This Is M2 Method.");

        this.m1();  // this keyword to invoke method.
    }

    public void show()
    {
        System.out.println("Data Is-: "+a.data);
    }

    ThisKeywordDemo getA()
    {
        return this; // Returning current class instance using this keyword.
    }

    void message()
    {
        System.out.println("Returning current class instance using this keyword.");
    }


    public static void main(String[] args) {

        ThisKeywordDemo d1 = new ThisKeywordDemo(1,"Ajay");
        ThisKeywordDemo d2 = new ThisKeywordDemo(2,"Vijay");

        ThisKeywordDemo d3 = new ThisKeywordDemo();

        ThisKeywordDemo d4 = new ThisKeywordDemo();

        d3.m1();
        d1.display();
        d4.objectCall();

        ThisKeywordDemo d6 = new ThisKeywordDemo();

        d6.getA().message();

    }
}


class B
{
    int data = 10;

    public B()
    {
        ThisKeywordDemo d5 = new ThisKeywordDemo(this); // this keyword used to pass as an argument to constructor.

    }
}
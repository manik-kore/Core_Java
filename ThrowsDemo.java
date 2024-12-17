package com.yash.corejava.exception.throwsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ClassNotFoundException;

public class ThrowsDemo {

    public static void main(String[] args) throws ClassNotFoundException,FileNotFoundException{

        ThrowsD t = new ThrowsD();

        try
        {
            t.show();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("Normal Termination");
    }

}

class ThrowsD
{
    void show() throws FileNotFoundException,ClassNotFoundException
    {
      //  FileInputStream f = new FileInputStream("D:/file.text");
        Class.forName("com.mysql.jdbc.driver");
    }
}
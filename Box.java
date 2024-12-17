package com.yash.corejava.practice19sep;

public class Box {

    int width,height,depth,volume=1;

    public Box() {
    }

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int volumeOfBox()
     {
         volume=width*height*depth;
         return volume;
     }

    public static void main(String[] args) {

        Box b = new Box(20,40,80);
        System.out.println(b.volumeOfBox());

    }
}

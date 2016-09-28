package com.java.borys.lesson07.pogo;


public class Box {

    //public
    //protected
    //private
    //

    public Box() {
        width = 7;
        height = 8;
    }

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }


    public final int width;

    public final int height;
//    public int width;
//
//    public int height;


    public Cat cat = null;

    public void setCat(Cat cat) {
        this.cat = cat;
        cat.meow();
        cat.getAge();
    }

//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

    public void setBoxOpen() {
        System.out.println("Box is open");
    }

    private int calculateVolumeBox() {
        int result = width * width * height;
        return result;
    }

    public void showInfo() {
        System.out.println("Volume is: " + calculateVolumeBox());
    }
}

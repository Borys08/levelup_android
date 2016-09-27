package com.java.borys.lesson07.pogo;

public class Cat {



    public static final String TAG = Cat.class.getSimpleName();

    private static int age;

    private static int countOfCats = 0;

    public Cat() {
        incrCountOfCats();
    }

    public static int getCountOfCats() {
        return countOfCats;

    }

    private void incrCountOfCats(){
        countOfCats++;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void meow() {


        System.out.println("Myau");
    }




}

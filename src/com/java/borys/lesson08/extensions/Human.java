package com.java.borys.lesson08.extensions;

/**
 * Created by Borys on 28.09.2016.
 */

public class Human {

//    public Human(){
//        System.out.println("constructor human");
//    }

    protected String name = null;

    protected int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo(){
        return "age: " + age + " name: " + name;
    }

//    @Override
//    public boolean equals(Object o) {
//        return super.equals(o);
//    }


    @Override
    public boolean equals(Object o) {

        if(o == null) return false;
        Human another = (Human) o;
        return another.name.equals(this.name) && another.age == this.age;
    }
}

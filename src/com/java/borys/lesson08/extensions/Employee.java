package com.java.borys.lesson08.extensions;

/**
 * @ author Borys
 * 28.09.2016.
 */
public class Employee extends Human{

//    public Employee(){
//        System.out.println("employee");
//    }

    public void work(){
        System.out.println("work");

        System.out.println(super.getInfo());
    }

//    public String getInfo(){
//        return "age: " + age + " name: " + name;
//    }


    @Override
    public String getInfo() {
       return "info employee";
    }
}

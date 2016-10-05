package com.java.borys.lesson10;

/**
 * @ author Borys
 * 05.10.2016.
 */
public class Dog extends Pet {

    @Override
    public void voice(){
        System.out.println("Gaf-gaf");
    }

    @Override
    public void love(){
        System.out.println(this.getClass().getSimpleName() + " loves you");
    }

}

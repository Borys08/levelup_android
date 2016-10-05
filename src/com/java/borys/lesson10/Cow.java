package com.java.borys.lesson10;

/**
 * @ author Borys
 * 05.10.2016.
 */

public class Cow extends Pet implements Eatable{



@Override
    public void love(){
    System.out.println("I love you" + Cow.class.getSimpleName());
}

    @Override
    public void voice(){
        System.out.println(" Moo");
    }

    @Override
    public void eat() {
        System.out.println("Cow eat");
    }
}

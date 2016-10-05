package com.java.borys.lesson10;

/**
 * @ author Borys
 * 05.10.2016.
 */
public class Wolf extends WildAnimal {


    @Override
    public void voice() {
        System.out.println("Wuuuu");
    }

    @Override
    public void eat(Pet pet) {
        System.out.println(pet.getName());
        pet.voice();
        System.out.println("I'm eating " + pet.getClass().getSimpleName());
    }


}

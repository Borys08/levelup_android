package com.java.borys.lesson10;

/**
 * @ author Borys
 * 05.10.2016.
 */

public abstract class Pet extends Animal {

    abstract public void love();

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

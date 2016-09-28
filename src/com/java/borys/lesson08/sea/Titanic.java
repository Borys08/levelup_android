package com.java.borys.lesson08.sea;

/**
 * @ author Borys
 * 28.09.2016.
 */
public class Titanic {



    public void crash(){
        Boat boat = new Boat();
        Boat boat1 = new Boat();
        Boat boat2 = new Boat();
        Boat boat3 = new Boat();
        Boat boat4 = new Boat();
        boat1.capacity = 1;
        boat2.capacity = 5;
        boat3.capacity = 6;
        boat4.capacity = 9;

        System.out.println(boat1.capacity);
        System.out.println(boat2.capacity);
        System.out.println(boat3.capacity);
        System.out.println(boat4.capacity);
    }

    private static class Boat{
        private int capacity = 0;

    }

}

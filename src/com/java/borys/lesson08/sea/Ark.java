package com.java.borys.lesson08.sea;

/**
 * @ author Borys
 * 28.09.2016.
 */
public class Ark {



    private static class Paddle {

        int length = 0;

    }

    public void go(){
        Paddle paddle1 = new Paddle();
        Paddle paddle2 = new Paddle();
        Paddle paddle3 = new Paddle();
        Paddle paddle4 = new Paddle();
        paddle1.length = 2;
        paddle2.length = 3;
        paddle3.length = 4;
        paddle4.length = 5;

        System.out.println(paddle1.length);
        System.out.println(paddle2.length);
        System.out.println(paddle3.length);
        System.out.println(paddle4.length);
    }

}

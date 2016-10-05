package com.java.borys.lesson09;

import java.util.Arrays;
import java.util.Random;

/**
 * @ author Borys
 * 05.10.2016.
 */
public class Main {

    private static void main(String[] args) {

        Random random = new Random();

       int array[] = new int[100];

        // int arraydoub[] = new int [100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100)-51;
             //arraydoub[i] = (int) random.nextGaussian(80) - 40;

        }
        Arrays.sort(array);
        //Arrays.sort(arraydoub);

        System.out.println(Arrays.toString(array));
        //System.out.println(random.nextGaussian());

    }

}
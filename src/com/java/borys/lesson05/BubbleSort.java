package com.java.borys.lesson05;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //int[] data = {50, 10, 40, 20, 60, 30, 70};
        second();
        //System.out.println(second(int[] data););

    }

    private static void swap(int[] array, int k) {
        int tmp = array[k];
        array[k] = array[(k + 1)];
        array[(k + 1)] = tmp;
    }

    private static void second() {

        int[] data = {45, 14, 2, 56, 174, 0};

        for (int barrier = data.length - 1; barrier > 0; barrier--) {
            for (int index = 0; index < barrier; index++){

                if(data[index + 1] < data[index]){
                    swap(data, index);
                }
                System.out.print(index);
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(data));
    }
}

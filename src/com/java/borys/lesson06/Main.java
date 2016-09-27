package com.java.borys.lesson06;

import java.util.Arrays;

public class Main {

    /*public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60, 70};
        //fromBarrierToCenterFirst(data);          //first
        //fromBarrierToCenterSecond(data);          //first
        fromCenterToBarrierSecond(data);            //second    //third


    }*/


    /*public static void fromBarrierToCenterFirst(int[] data) {
        int i = 0, j = data.length - 1;
        while (i < j){
            swap(data, i, j);
            i++;
            j--;

        }
        System.out.println(Arrays.toString(data));
    }

    private static void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;

    }*/

    /*private static void fromCenterToBarrierSecond(int[] data) {
        if(data.length % 2 != 0){
            int i = data.length / 2 - 1;
            int j = i + 2;
            System.out.println("i= " + i);
            System.out.println("j= " + j);
            while (i >= 0){
                swap(data, i, j);
                i--;
                j++;
            }
            System.out.println(Arrays.toString(data));
        }
        else{
                int i = data.length, j = i + 1;
            System.out.println("i= " + i);
            System.out.println("j= " + j);
                while (i >= 0) {
                    swap(data, i, j);
                    i--;
                    j++;
                }
                System.out.println(Arrays.toString(data));

            }
        }

    private static void swap(int[] array, int first, int second) {
        int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }*/



    /*private static void swap(int[], array, int k) {
        int tmp = array[k];
        array[k] = array[(k + 1)];
        array[(k + 1)] = tmp;
    }*/


}

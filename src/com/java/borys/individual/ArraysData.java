package com.java.borys.individual;

import java.util.Arrays;

/**
 * @author Borys
 * 27.09.2016
 */
public class ArraysData {

    private static void main(String[] args) {

        // способы объявления массивов
        // [количество]
        int[] array = new int[4];
//        int[] array = {0, 0, 0, 0};
//        double sec[] = new double[3];
        Double[] doubles = new Double[56];

        String[] strings = {"first", "second"};

        // [index]
        strings[1] = "first";

//        String s = Arrays.toString(strings);
//        System.out.println(s);

        // для вывода массива использовать: Arrays.toString(ИМЯ МАССИВА)
//        System.out.println(strings);

        // если хочешь пересприсвоить
//        strings[1] = strings[0];

        // для многомерных массивов: Arrays.deepToString()


//        int[] data = {10, 20, 30, 40, 50, 60, 70};
//        fromBarrierToCenterFirst(data);
//        fromBarrierToCenterSecond(data);
//        fromCenterToBarrierSecond(data);

        forEachExample();
    }

    private static void forEachExample(){

        int[] sec = { 1, 2, 3, 4, 5 };
        int sumSec = 0;
        for(int i = 0; i < 5; i++) sumSec += sec[i];


        int[] nums = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for(int i : nums) {

        }

        System.out.println(sumSec);
    }

    public static void fromBarrierToCenterFirst(int[] data) {
        int i = 0, j = data.length - 1;
        while (i < j) {
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
    }

}

package com.java.borys.lesson05;// Created by Borys on 19.09.2016.

// работа с массивами и сортировка

import java.util.Arrays;

public class Lesson5 {

    // перегрузка методов - метод с различными параметрами

    // marh(int a, int b){a+b} ......math(int a, int b, int c){a+b+c}....math(...)

    /*public static void main(String[] args) {
        int first = 12;
        double second = 12.5445698;

        System.out.println(math(first, second));
    }

    public static String math() {
        String string = "We don't have numbers";
        return string;
    }

    public static int math(int a, int b) {
        return a + b;
    }

    public static double math(double a, double b) {
        return a + b;
    }

    public static double math(int a, double b) {
        return a + b;
    }

    public static double math(double a, int b) {
        return a + b;
    }*/

    // мой выход к доске

    /*public static void main(String[] args) {
        int a = 50;
        int b = 135;
        System.out.println(math (a, b));
    }

    public static String math(int a, int b) {
        String string;
        if (b == 0) {
            string = "Нельзя делить на ноль";
            return string;
        }
        if ( a % b == 0) {
            string = String.valueOf(a / b);
            return string;
        }
        else {
            string = String.valueOf(a /b) + " в целом, " + String.valueOf(a % b)
                    + " в остатке.";
            return  string;
        }


    }
    public static String math(double a, double b) {
        String string;
        if (b == 0) {
            string = "Нельзя делить на ноль";
            return string;
        }
        if ( a % b == 0) {
            string = String.valueOf(a / b);
            return string;
        }
        else {
            string = String.valueOf(a /b) + " в целом, " + String.valueOf(a % b)
                    + " в остатке.";
            return  string;
        }


    }
    public static String math(int a, double b) {
        String string;
        if (b == 0) {
            string = "Нельзя делить на ноль";
            return string;
        }
        if ( a % b == 0) {
            string = String.valueOf(a / b);
            return string;
        }
        else {
            string = String.valueOf(a /b) + " в целом, " + String.valueOf(a % b)
                    + " в остатке.";
            return  string;
        }


    }

    public static String math(double a, int b) {
        String string;
        if (b == 0) {
            string = "Нельзя делить на ноль";
            return string;
        }
        if ( a % b == 0) {
            string = String.valueOf(a / b);
            return string;
        }
        else {
            string = String.valueOf(a /b) + " в целом, " + String.valueOf(a % b)
                    + " в остатке.";
            return  string;
        }*/


    // learning Arrays

    /*public static void firstExample() {

        // int [][] arr = {{2,3,4,5}, {5,6,7}};

        // int[] dataInt = new int[3];

        String[][] data = new String[4][3];

        data[0][0] = "1";
        data[0][1] = "Игорь";
        data[0][2] = "066 666 66 66";

        data[1][0] = "2";
        data[1][1] = "Роман";
        data[1][2] = "063 633 36 63";

        data[2][0] = "3";
        data[2][1] = "Егор";
        data[2][2] = "095 959 59 59";

        data[3][0] = "4";
        data[3][1] = "Иван";
        data[3][2] = "099 999 99 99";

        System.out.println(Arrays.deepToString(data));

    }*/

    /*private static void hardCoreExample(){

        Integer [] Integer [] =

    }*/

    /*private static void fillExample(){

        int size = 4;
        boolean [] test1 = new boolean[size];
        int [] test2 = new int[size];
        String[] test3 = new String[size];
        Arrays.fill(test1, true); // присваиваем всем true
        System.out.println(Arrays.toString(test1));

        Arrays.fill(test2, 9); // присваем всем 9
        Arrays.fill(test3, "Word");
        System.out.println(Arrays.toString(test2));
        System.out.println(Arrays.toString(test3));

    }*/


    /*private  static  void secondFillExanple(){
        int size = 4;
        String[] data = new String[size];
        Arrays.fill(data, "Ivan");
        Arrays.fill(data, 2, 3, "Petr");
        System.out.println(Arrays.toString(data));
        }*/

    /*public static void main(String[] args) {

        return nums;
    }

    private  static  void Numbers(){
        int[] nums = new int [7];

        Arrays.fill(nums, 5);
        Arrays.fill(nums, 0, 1, 6);
        Arrays.fill(nums, 3, 4, 8);
        Arrays.fill(nums, 5, 6, 4);
        System.out.println(Arrays.toString(nums));
    }*/



    /*
    *arrayCopy
    * var0 -- Это исходный массив
    * var1 - Это стартовая позиция в исходном массиве
    * var2 - Это массив назначения
    * var3 - Это стартовая позиция в данных назначения
    * var4 - это количество элементов массива, которые будут скопированы
     */

    /*private static double[] concatDoubleArray(double[] firstData, double [] secondData[]){

        if (firstData == null)
            return secondData;
        if (secondData == null)
            return firstData;

        double[] result = new double(firstData.length + secondData.length);
        System.out.println(firstData, 0, result, 0, firstData.length);
        System.out.println(secondData, 0, result, firstData.length, secondData.length);
        return result;

    }*/

    /*public static void main(String[] args) {

    }

    private static int[] concatIntArray(int[] firstData, int[] secondData) {

        if (firstData.length == 0)
            return secondData;
        if (secondData.length == 0)
            return firstData;

        int[] result = new int [firstData.length + secondData.length];
        System.arraycopy(firstData, 0, result, 0, firstData.length);
        System.arraycopy(secondData, 0, result, firstData.length, secondData.length);

        return result;
    }*/

    /*private int[] copyPartArray(int[] array, int start){
        if (array == null)
            return null;
        if(start > array.length)
            return null;
        int[] result = new int[array.length - start]

                .......
    }*/


}
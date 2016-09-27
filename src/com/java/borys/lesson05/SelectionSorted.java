package com.java.borys.lesson05;

import java.util.Arrays;

public class SelectionSorted {

    public static void main(String[] args) {
        int[] data = {90, 30, 10, 70, 40, 80};
        selectionSort(data);

    }

    private static void selectionSort(int[] data) {
        for (int barrier = data.length - 1; barrier > 0; barrier--){
            for (int index = barrier; index >= 0; index--){
                if (data[barrier] < data[index ]){
                    int tmp = data[index];
                    data[index] = data[barrier];
                    data[barrier] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(data));
    }
}

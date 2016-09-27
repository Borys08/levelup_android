package com.java.borys.individual;

/**
 * Created by Borys on 27.09.2016.
 */
public class Gradusy {

    /**
     * при выходе из класса - ставить приватным
     * TODO
     */
    private static void main(String[] args) {
        // переписать имена переменных на адекватные
        float x, x1, x2, C, F;

        // TODO
        // наши переменные не инициализированы !!!
//        System.out.println("F = " + convertCellsiumToFarengeith(x1, x2));
//        System.out.println("C = " + convertFarengeithToCellsium(x2, x1));

    }

    // TODO: 27.09.2016
    // проверить работоспособность метода
    private static float convertCellsiumToFarengeith(float celcium, float resultCellsiumToFarengeith) {
        resultCellsiumToFarengeith = (celcium - 32) * (5.0f / 9.0f);
        return resultCellsiumToFarengeith;

    }
    // TODO: 27.09.2016
    // переписать с использованием правильных имён
    // проверить работоспособность метода
//    private static float convertFarengeithToCellsium(float x2, float x1) {
//        resultFarengeithToCellsium = x * (9 / 5) + 32;
//        return resultFarengeithToCellsium;
//    }

}

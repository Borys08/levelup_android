package com.java.borys.individual;

/**
 * @ author Borys
 * 27.09.2016.
 */
public class Degrees {

    /**
     * при выходе из класса - ставить приватным
     * TODO
     */
    private static void main(String[] args) {
        // переписать имена переменных на адекватные

        float inputValueForCellsium = 40;
        float inputValueForFarengeith = 32;
        float resultCelssium;
        float resultFarengeith;

        // TODO
        // наши переменные не инициализированы !!!
        System.out.println("Result of convertation from cellsium to farengeith is: " + convertCellsiumToFarengeith(inputValueForFarengeith));
        System.out.println("Result of convertation from farengeith to cellsium is: " + convertFarengeithToCellsium(inputValueForFarengeith));

    }

    // TODO: 27.09.2016
    // проверить работоспособность метода
    private static float convertCellsiumToFarengeith(float celcium) {
        float resultCellsiumToFarengeith = (celcium - 32) * (5.0f / 9.0f);
        return resultCellsiumToFarengeith;
    }

    // TODO: 27.09.2016
    // переписать с использованием правильных имён
    // проверить работоспособность метода
    private static float convertFarengeithToCellsium(float farengeith) {
       float resultFarengeithToCellsium = farengeith * (9 / 5) + 32;
        return resultFarengeithToCellsium;
    }

}

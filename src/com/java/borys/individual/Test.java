package com.java.borys.individual;

import java.util.Scanner;


public class Test {

    private static void main(String[] args) {

        int first = 10;
        int second = 50;

        Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
        int i = 2;
        System.out.print("Введите целое число: ");
        if(sc.hasNextInt()) { // возвращает истинну если с потока ввода можно считать целое число
            i = sc.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.println(i*2);
        } else {
            System.out.println("Вы ввели не целое число");
        }

        System.out.println(hasNextInt(first, second));

    }



    private static int hasNextInt (int a, int b) {
        int result = a * b;
        return result;
    }


}

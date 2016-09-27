package com.java.borys.individual;


import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        mainMath();
    }

    public static void mainMath() {
        System.out.println("Введите первое число: ");
        int first = readIntFromConsole();
        System.out.println("Введите второе число: ");
        int second = readIntFromConsole();

        System.out.println("Введите математический знак(+, -, *, /)");
        Scanner sc = new Scanner(System.in);
        String sine;
        sine = sc.nextLine();
        mathVoid(first, second, sine);
    }


    private static void mathVoid(int first, int second, String sine) {

        int result;
        switch (sine){
            case "/": {
                result = first / second;
                System.out.println(result);
                break;
            }
            case "+": {
                result = first + second;
                System.out.println(result);
                break;
            }
            case "*": {
                result = first * second;
                System.out.println(result);
                break;
            }
            case "-": {
                result = first - second;
                System.out.println(result);
                break;
            }
            default: {
                System.out.println("Введите правильный математический знак");
                mainMath();
            }

        }

    }

    private static int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}

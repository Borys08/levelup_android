package com.java.borys.individual;

import java.util.Scanner;

/**
 * Created by Borys on 25.09.2016.
 */

public class SwitchCalc {

    /*public static void main(String[] args) {

        double a;
        double b;


    }*/

    public static void main(String[] args) {
        System.out.println("Enter your string");
        String str = readStringFromConsole();
        System.out.println(str);
    }

    private static String readStringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        if (isConsoleHasString()) {
            return scanner.nextLine();
        } else {
            return "";
        }
        //return scanner.nextLine();
    }

    private static int readIntFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static boolean isConsoleHasString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.hasNextLine();
    }

}

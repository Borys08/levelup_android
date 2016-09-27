package com.java.borys.individual;


public class Main {

    private static void main(String[] args) {

        int a = 50;
        int b = 20;

        int c = summ(a, b);

        String text = secondSumm(a, b);
        //System.out.println(text);

        double firstDouble = 50.9876543;
        double secondDouble = 45.12345678;

        double secRes = a * b;
        double result = newExample(firstDouble, secondDouble);

        //System.out.println(strDouble(firstDouble, secondDouble));

        //root(a, b, c);

        //root(firstDouble, secondDouble);

        int age = 16;
        String name = "Borys";

        hSecurity(age, name);

    }

    private static void hSecurity(int age, String name) {
        String text;
        if (age < 18) {
            int raz = 18 - age;
            text = name + ", your age is so small. Come back after " + raz + " years.";
            System.out.println(text);
        }
        if (age > 20){
            System.out.println("Enough 18");
        }else if (age >= 18){
            System.out.println(name + ", you're welcome");
        }
    }

    private static void root(double one, double two) {
        double resultRoot = one * two;
        System.out.println(resultRoot);
    }

    private static void root(int a, int b, int c) {
        int resultRoot = a * b * c;
        System.out.println(resultRoot);
    }


    private static String strDouble(double one, double two) {
        double resultStrDouble = one * two;
        String row = "Result of two double = " + one + " * " + two + " = " + resultStrDouble;
        return row;
    }

    private void firstExmpl() {
        double first = newExample(56.656789, 567.34567);
    }

    private static double newExample(double first, double second) {
        double resultDouble = first * second;
        return resultDouble;
    }

    private static String secondSumm(int first, int second) {
        // int result = first + second;
        String str = "Result " + first + " + " + second + " = " + (first + second);
        return str;
    }

    private static int summ(int first, int second) {
        int result = first * second;
        return result;
    }

    private static void mass(int first, int second) {
        int result = first + second;

        System.out.println(result);
    }

    private static void writeNameAndAge(int age, String name) {
        System.out.println(name + " your age is " + age);
    }

}

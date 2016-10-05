package com.java.borys.lesson08;

import com.java.borys.lesson08.extensions.Employee;
import com.java.borys.lesson08.extensions.HardEmployee;
import com.java.borys.lesson08.extensions.Human;
import com.java.borys.lesson08.extensions.Nurse;
import com.java.borys.lesson08.sea.Ark;
import com.java.borys.lesson08.sea.Titanic;


/**
 * @ author Borys
 * 28.09.2016.
 */
public class Main {

//    private static void main(String[] args) {
////        String s = "sad";
////        Object o = new Object();
//
////        Nested nested = new Nested();
//
//        //       Titanic titanic = new Titanic();
////        titanic.crash();
////
////        System.out.println(" ");
////
////        Ark ark1 = new Ark();
////        ark1.go();
//
//
//        // created Local class
//
////        class Local{
////            int value = 0;
////        }
////
////        Local local = new Local ();
//
////        Corteg corteg;
////        corteg = getCorteg();
////        corteg.ark.go();
////        corteg.titanic.crash();
////
////
////        Point point = getPoint();
////        System.out.println("x = " + point.x + " y = " + point.y);
//
//
//        // created Anonymous class
//
////        Ark ark = new Ark() {
////            Ark ark = new Ark() {
////                int value = 8;
////
////                @Override
////                public void go() {
////                    super.go();
////                    System.out.println("value");
////                }
////            };
////
////            ark.go();
////
////        };
//
//
////        Human human = new Human();
////
////        Employee employee = new Employee();
////
////        System.out.println(employee.getInfo());
////        employee.work();
//
//
////        Human human = new HardEmployee();
////
////        System.out.println(human.getInfo());
////
////        human = new Nurse();   // перезатирание ссылки
////
////        System.out.println(human.getInfo());
////
////
////
////        Human human1 = new Human();
////            human1.setAge(4);
////        human1.setName("Borys");
////
////        Human human2 = new Human();
////        human2.setAge(4);
////        human2.setName("Borys");
////
////        System.out.println(human1==human2);               // ссылки на объект
////        System.out.println(human1.equals(human2));
//
//
//    }
//
//
//    private static void printInfo(Human human){
//        System.out.println(human.getInfo());
//    }
//
//
//    //  Anonymous class
//
//    public static class Corteg {
//
//        public final Ark ark;
//        public final Titanic titanic;
//
//        public Corteg(Ark ark, Titanic titanic) {
//            this.ark = ark;
//            this.titanic = titanic;
//        }
//    }
//
//    public static Corteg getCorteg() {
//        Corteg corteg = new Corteg(new Ark(), new Titanic());
//        return corteg;
//    }
//
//
//    static class Point {
//        public final int x;
//        public final int y;
//
//        Point(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//
//
//    }
//
//    public static Point getPoint() {
//        int x = 5;
//        int y = 6;
//
//        Point point = new Point(x, y);
//        return point;
//    }
//
//
////    private void method() {
////        Inner inner = new Inner();
////        Nested nested = new Nested();
////    }
////
////    // created static internal class
////    private static class Nested {
////        private int value;
////    }
////
////    // created non-static class
////    private class Inner {
////        private int value;
////    }
//}
}
package com.java.borys.lesson07;


import com.java.borys.lesson07.pogo.Box;
import com.java.borys.lesson07.pogo.Cat;

import static com.java.borys.lesson07.pogo.Cat.getCountOfCats;

public class Main {


    private static void main(String[] args) {
        // write your code here

        Box box = new Box();
        Box box1 = new Box(5, 8);
        Box box2 = box1;


//        box2.setHeight(3);

//        System.out.println(box2 == box1);

        //    box.heigth = 100;
        //    box.width = 200;

        Cat cat = new Cat();

        cat.setAge(3);
        box.setCat(cat);

        System.out.println(cat.getAge());

        System.out.println("width: " + box.width + " height: " + box.height);

        box.setBoxOpen();
        box.showInfo();


//        Cat cat;
        for (int i = 0; i < 1000; i++) {
            new Cat();
        }

        Cat cat1 = new Cat();
        System.out.println(getCountOfCats());

        System.out.println(Cat.TAG);


        Object obj = new Cat();
        Object obj1 = new Box();


        Main main = new Main();
        main.printClassName(main);
        main.printClassName(obj);
        main.printClassName(obj1);

        printClassName(main);

        getCountOfCats();
    }

    private static void printClassName(Object obj) {

        if (obj instanceof Cat) {

            Cat cat = ((Cat) obj);

            ((Cat) obj).meow();
            cat.meow();


            System.out.println("Cat");
        } else if (obj instanceof Box) {
            System.out.println("Box");
        } else {
            System.out.println("Main");
        }
    }


}

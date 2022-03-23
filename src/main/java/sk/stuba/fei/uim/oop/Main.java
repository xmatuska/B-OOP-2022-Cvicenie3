package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;

public class Main {

    public static void main(String[] args) {
        Auto skoda = new Auto();
        Auto bmw = new Auto(50);

        System.out.println("skoda");
        System.out.println(skoda.stav());

        skoda.jazdi(100);
        System.out.println(skoda.stav());

        System.out.println("bmw");
        System.out.println(bmw.stav());

        bmw.jazdi(100);
        System.out.println(bmw.stav());


    }
}
package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.auto.Auto;
import sk.stuba.fei.uim.oop.auto.Vozidlo;

public class Main {

    public static void main(String[] args) {
        Vozidlo bicykel = new Vozidlo("SOBI 20", 2);
        Auto volvo = new Auto("Volvo", "XC90",4);

        bicykel.trubit();
        volvo.trubit();

    }
}
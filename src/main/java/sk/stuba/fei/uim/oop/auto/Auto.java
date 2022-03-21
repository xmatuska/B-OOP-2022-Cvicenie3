package sk.stuba.fei.uim.oop.auto;

public class Auto {

    private  double kapacitaNadrze;
    private  double stavNadrze;

    public void jazdi(double distance){
        stavNadrze -= distance * 0.2;
        if (stavNadrze < 0){
            stavNadrze = 0;
        }
    }

    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }
}


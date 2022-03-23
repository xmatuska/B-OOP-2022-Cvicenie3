package sk.stuba.fei.uim.oop.auto;

public class Auto {

    public static final double PALIVO_NA_KM = 0.2;
    public static final double KAPACITA_NADRZE = 100;

    private  double kapacitaNadrze;
    private  double stavNadrze;
    private boolean ojazdene;

    public Auto(){
        this(KAPACITA_NADRZE);
    }

    public Auto(double kapacitaNadrze){
        this.ojazdene = true;
        this.kapacitaNadrze = kapacitaNadrze;
        this.stavNadrze = 50;
    }

    public void jazdi(double distance){
        this.ojazdene = true;
        stavNadrze -= distance * PALIVO_NA_KM;
        if (stavNadrze < 0){
            stavNadrze = 0;
        }
    }

    public double getKapacitaNadrze() {
        return kapacitaNadrze;
    }

    public void setKapacitaNadrze(double kapacitaNadrze) {
        this.kapacitaNadrze = kapacitaNadrze;
    }

    public String stav(){
        String vysledok;
        if (this.ojazdene){
            vysledok = "auto je ojazdene";
        }
        else{
            vysledok = "auto nie je ojazdene";
        }
        vysledok += " * stav nadrdze : " + stavNadrze + "/" + kapacitaNadrze;
        return vysledok;
    }


    public double getStavNadrze() {
        return stavNadrze;
    }

    public void setStavNadrze(double stavNadrze) {
        this.stavNadrze = stavNadrze;
    }
}


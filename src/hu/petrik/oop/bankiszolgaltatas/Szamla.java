package hu.petrik.oop.bankiszolgaltatas;

public class Szamla extends BankiSzolgaltatas{
    private int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet (int osszeg){

    }

    public boolean kivesz (int osszeg){
        return false;
    }
}

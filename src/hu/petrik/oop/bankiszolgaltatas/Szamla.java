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
        aktualisEgyenleg += osszeg;
    }

    public boolean kivesz (int osszeg){
        if (osszeg > this.aktualisEgyenleg){
            return false;
        } else {
            aktualisEgyenleg -= osszeg;
            return true;
        }
    }

    public Kartya ujKartya (String kartyaszam){
        Kartya k = new Kartya(getTulajdonos(), Szamla.this, kartyaszam);
        return k;
    }
}

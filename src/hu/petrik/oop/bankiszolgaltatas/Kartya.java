package hu.petrik.oop.bankiszolgaltatas;

public class Kartya extends BankiSzolgaltatas{

    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas (int osszeg){
        if (szamla.getAktualisEgyenleg() - osszeg < 0){
            return false;
        }else {
            szamla.befizet(-osszeg);
            return true;
        }
    }
}

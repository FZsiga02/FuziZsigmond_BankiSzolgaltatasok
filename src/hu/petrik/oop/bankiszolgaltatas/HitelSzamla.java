package hu.petrik.oop.bankiszolgaltatas;

public class HitelSzamla extends Szamla{

    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    public boolean kivesz (int osszeg){
        if (this.getAktualisEgyenleg() - osszeg < 0 && Math.abs(this.getAktualisEgyenleg() - osszeg) > this.getHitelKeret()){
            return false;
        } else {
            return true;
        }
    }
}

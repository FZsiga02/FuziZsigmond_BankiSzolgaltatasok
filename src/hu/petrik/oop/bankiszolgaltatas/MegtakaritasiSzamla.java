package hu.petrik.oop.bankiszolgaltatas;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;
    public static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz (int osszeg){
        if (this.getAktualisEgyenleg() - osszeg < 0){
            return false;
        } else {
            befizet(-osszeg);
            return true;
        }
    }

    public void kamatJovairas(){
        befizet((int)kamat*this.getAktualisEgyenleg());
    }
}

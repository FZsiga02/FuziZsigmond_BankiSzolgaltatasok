package hu.petrik.oop.bankiszolgaltatas;

public final class Tulajdonos {
    private String nev;

    public Tulajdonos(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return String.format("Tulajdonos: %s", this.nev);
    }
}

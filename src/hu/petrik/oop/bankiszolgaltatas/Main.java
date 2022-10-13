package hu.petrik.oop.bankiszolgaltatas;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t = new Tulajdonos("Gipsz Jakab");
        Bank b = new Bank();
        Szamla sz = new Szamla(t);
        Kartya k = new Kartya(t, sz, "123456789");
        HitelSzamla h = new HitelSzamla(t, 200000);
        MegtakaritasiSzamla m = new MegtakaritasiSzamla(t);
        BankiSzolgaltatas bsz = new BankiSzolgaltatas(t);

        b.szamlanyitas(t, 100000);
        b.szamlanyitas(t, 200000);
        b.szamlanyitas(t, 0);

        sz.befizet(300000);


        System.out.println(t);
        System.out.println("Összegyenleg: " + b.getOsszegyenleg(t));
        System.out.println("Összhitelkeret: " + b.getOsszhitelkeret());
        System.out.println(b.legnagyobbEgyenleguSzamla(t));
    }
}

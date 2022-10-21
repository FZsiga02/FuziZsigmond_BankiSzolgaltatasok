package hu.petrik.oop.bankiszolgaltatas;

public class Main {

    public static void main(String[] args) {
        Tulajdonos t = new Tulajdonos("Gipsz Jakab");
        MegtakaritasiSzamla m1 = new MegtakaritasiSzamla (t);
        Szamla szamla = new MegtakaritasiSzamla(t);
        System.out.println(t.getNev());
        szamla.befizet(200000);
        System.out.println("Egyenleg: "+ szamla.getAktualisEgyenleg());
        szamla.kivesz(100000);
        System.out.println("Új egyenleg: "+ szamla.getAktualisEgyenleg());

        HitelSzamla hitelSzamla = new HitelSzamla(t,500);
        System.out.printf("Hitelkeret: %d\n", hitelSzamla.getHitelKeret());
        hitelSzamla.kivesz(450);
        System.out.printf("Új hitelkeret: %d\n", hitelSzamla.getHitelKeret());

        Kartya kartya = new Kartya(t,szamla,"123456789");
        System.out.printf("Kártyaszám: %s\n",kartya.getKartyaSzam());
        kartya.vasarlas(20000);
        System.out.printf("Megmaradt összeg: %d\n",szamla.getAktualisEgyenleg());

        HitelSzamla h1 = new HitelSzamla(new Tulajdonos("Gipsz Jakab"),700);
        HitelSzamla h2 = new HitelSzamla(new Tulajdonos("Gipsz Jakab"),500);
        MegtakaritasiSzamla m2 = new MegtakaritasiSzamla(new Tulajdonos("Kiss István"));
        MegtakaritasiSzamla m3 = new MegtakaritasiSzamla(new Tulajdonos("Kovács Béla"));
        MegtakaritasiSzamla m4 = new MegtakaritasiSzamla(new Tulajdonos("Németh József"));
        MegtakaritasiSzamla m5 = new MegtakaritasiSzamla(new Tulajdonos("Molnár Aladár"));
        m4.befizet(20000);
        m4.setKamat(1000);
        m4.kamatJovairas();
        m5.befizet(1500);
        m5.setKamat(170);
        m5.kamatJovairas();

        Bank bank = new Bank();
        System.out.println(bank.legnagyobbEgyenleguSzamla(new Tulajdonos("Gipsz Jakab")));
        System.out.println(bank.getOsszegyenleg(new Tulajdonos("Gipsz Jakab")));
    }
}

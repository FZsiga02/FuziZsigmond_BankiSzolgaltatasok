package hu.petrik.oop.bankiszolgaltatas;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Szamla> szamlaLista = new ArrayList<>();

    public Bank() {
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret){
        if (hitelKeret == 0){
            Szamla megtakaritas = new MegtakaritasiSzamla(tulajdonos);
            szamlaLista.add(megtakaritas);
            return megtakaritas;
        } else if (hitelKeret > 0){
            Szamla hitel = new HitelSzamla(tulajdonos, hitelKeret);
            szamlaLista.add(hitel);
            return hitel;
        } else {
            return null;
        }
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos){
        int ossz = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            ossz += szamlaLista.get(i).getAktualisEgyenleg();
        }
        return ossz;
    }

    public Szamla legnagyobbEgyenleguSzamla (Tulajdonos tulajdonos){
        int max = 0;
        int index = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).getAktualisEgyenleg() > max){
                max = szamlaLista.get(i).getAktualisEgyenleg();
                index = i;
            }
        }
        return szamlaLista.get(index);
    }

    public long getOsszhitelkeret(){
        long ossz = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i) instanceof HitelSzamla){
                ossz += ((HitelSzamla) szamlaLista.get(i)).getHitelKeret();
            }
        }
        return ossz;
    }
}

package opdracht.domain.db;

import opdracht.domain.model.Rekening;

import java.util.ArrayList;
import java.util.Observable;

public class Bank extends Observable {

    ArrayList<Rekening> rekeningen = new ArrayList<Rekening>();

    public Bank() {

    }
    public void add(Rekening rekening) {
        this.rekeningen.add(rekening);
        setChanged();
        notifyObservers(rekening);

    }

    public ArrayList<Rekening> getRekeningen() {
        return rekeningen;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "rekeningen=" + rekeningen +
                '}';
    }
}
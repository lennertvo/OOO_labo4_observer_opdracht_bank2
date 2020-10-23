package opdracht.domain.observers;

import opdracht.domain.model.Rekening;

import java.util.Observable;
import java.util.Observer;

public class Auditor implements Observer {
    @Override
    public void update(Observable o, Object rekening) {
        if(rekening instanceof Rekening){
            System.out.println("Nieuwe rekening geopend op datum" + ((Rekening) rekening).getStartdatum() + " met nummer " +
                    ((Rekening) rekening).getRekeningnummer() + " en saldo " + ((Rekening) rekening).getSaldo());
        }
    }
}

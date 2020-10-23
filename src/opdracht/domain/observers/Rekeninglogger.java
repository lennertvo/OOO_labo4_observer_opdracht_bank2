package opdracht.domain.observers;

import opdracht.domain.model.Rekening;

import java.util.Observable;
import java.util.Observer;

public class Rekeninglogger implements Observer {
    private int count = 0;
    @Override
    public void update(Observable bank, Object rekening) {

        if(rekening instanceof Rekening){
            count++;
            System.out.println("Het nieuw rekeningsnummer is: " + ((Rekening) rekening).getRekeningnummer() + " nu heeft de bank " + count + " rekening(en)");

        }



    }
}
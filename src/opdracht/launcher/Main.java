package opdracht.launcher;


import opdracht.domain.db.Bank;
import opdracht.domain.model.Rekening;
import opdracht.domain.observers.Auditor;
import opdracht.domain.observers.Rekeninglogger;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Rekening r1 = new Rekening(123, 5000);
        Rekening r2 = new Rekening(124, 356);
        Observer auditor = new Auditor();
        bank.addObserver(auditor);
        Observer rekeninglogger = new Rekeninglogger();
        bank.addObserver(rekeninglogger);
        bank.add(r1);
        bank.add(r2);
        System.out.println(bank.toString());
    }
}

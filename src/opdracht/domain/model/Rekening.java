package opdracht.domain.model;

import java.util.Date;

public class Rekening {
    private int rekeningnummer;
    private double saldo;
    private Date startdatum;

    public Rekening(int rekeningnummer, double saldo) {
        setRekeningnummer(rekeningnummer);
        setSaldo(saldo);
        setStartdatum(new Date(System.currentTimeMillis()));
    }

    private void setRekeningnummer(int rekeningnummer) {
        this.rekeningnummer = rekeningnummer;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStartdatum(Date startdatum) {
        this.startdatum = startdatum;
    }

    public Date getStartdatum() {
        return startdatum;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getRekeningnummer() {
        return rekeningnummer;
    }
}


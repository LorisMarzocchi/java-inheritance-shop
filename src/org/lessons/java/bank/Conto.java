package org.lessons.java.bank;

import java.text.DecimalFormat;

public class Conto {

    int nConto;
    private String nomeUtente;
    private double saldo;

    public Conto(int nConto, String nomeUtente) {
        this.nConto = nConto;
        this.nomeUtente = nomeUtente;
        this.saldo = 0;
    }

    public String getSaldoFormattato() {
        if (saldo == 0){
            return "0€";
        } else {
            DecimalFormat df = new DecimalFormat("#.00");
            return df.format(saldo) + "€";
        }
    }
    public String informazioniConto() {
        return "Numero Conto: " + nConto + " - Nome Proprietario: " + nomeUtente + " - Saldo: " + getSaldoFormattato();
    }
    public boolean versamento(double sommaDaVersare) {
        if (sommaDaVersare > 0) {
            saldo += sommaDaVersare;
            return true;
        }
        return false;
    }

    public boolean prelievo(double sommaDaPrelevare) {
        if (sommaDaPrelevare > 0 && saldo - sommaDaPrelevare >= 0) {
            saldo -= sommaDaPrelevare;
            return true;
        }
        return false;
    }


    public int getnConto() {
        return nConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }
}

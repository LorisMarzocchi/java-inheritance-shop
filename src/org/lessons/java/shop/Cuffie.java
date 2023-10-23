package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {

    private String colore;
    private boolean wireless;

    public Cuffie(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String colore, boolean wireless) {
        super(nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    @Override
    public BigDecimal getPrezzoScontato() {
        if (!wireless) {
            BigDecimal sconto = getPrezzoConIva().multiply(new BigDecimal("0.07"));
            return getPrezzoConIva().subtract(sconto); // sconto del 7% se non sono wireless
        }
        return super.getPrezzoScontato();
    }


    @Override
    public String toString() {
        return super.toString() + "Cuffie" + ", Colore: " + colore + ", Wireless: " + (wireless ? "Sì" : "No");
    }

}

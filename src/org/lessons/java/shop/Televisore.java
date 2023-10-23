package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{
    private int altezza;
    private int lunghezza;
    private boolean smartTv;



    public Televisore(String nome, String descrizione, BigDecimal prezzo, BigDecimal  iva, int altezza, int lunghezza, boolean smartTV) {
        super(nome, descrizione, prezzo, iva);
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.smartTv = smartTV;
    }

    public boolean getSmartTv() {
        return smartTv;
    }

    public void setSmartTv(boolean smartTv) {
        this.smartTv = smartTv;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLunghezza() {
        return lunghezza;
    }

    public void setLunghezza(int lunghezza) {
        this.lunghezza = lunghezza;
    }

    @Override
    public String toString() {
        return super.toString() + ", Dimensione: Altezza: " + altezza + ", Larghezza: " + lunghezza + ", Smart: " + (smartTv ? "Sì" : "No");
    }





}

package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto{
    private String imei;
    private int memoria;

    public Smartphone(String nome, String descrizione, BigDecimal prezzo, BigDecimal iva, String imei, int memoria) {
        super(nome, descrizione, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }


    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return memoria;
    }

//    public double getPrezzoScontato() {
//        if (memoria < 32) {
//            return getPrezzoConIva() - (getPrezzoConIva() * 5.0 / 100); // Sconto del 5%
//        }
//        return super.getPrezzoScontato();
//    }
    @Override
    public BigDecimal getPrezzoScontato() {
        if (memoria < 32) {
            return getPrezzoConIva().multiply(new BigDecimal("0.95")); // sconto del 5% sul prezzo con IVA
        }
        return super.getPrezzoScontato();
    }



    @Override
    public String toString() {
        return super.getNomeCompleto() + " Smartphone " + " - IMEI: " + imei + " - Memoria: " + memoria + "GB";
    }
}

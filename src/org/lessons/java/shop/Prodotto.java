package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

//    quando si parla di soldi si usa BigDecimal
    private final int codice = new Random().nextInt(99999999);
    private String nome;
    private String descrizione;
    private BigDecimal  prezzo;
    private BigDecimal  iva;

    public Prodotto( String nome, String descrizione, BigDecimal  prezzo, BigDecimal  iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    private String getPaddedCodice() {
        return String.format("%08d", codice);
    }
    @Override
    public String toString() {
        return getNomeCompleto();
    }
    public String getNomeCompleto(){
        return "Codice: " + getPaddedCodice() + " - Nome: " + nome + " - Prezzo Base: " + getPrezzoConIva() + " - ";
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public BigDecimal  getPrezzoBase(){
        return prezzo;
    }

    public BigDecimal getPrezzoConIva() {
        BigDecimal fattoreIva = BigDecimal.valueOf(1 + (iva.doubleValue() / 100));
        BigDecimal prezzoConIva = prezzo.multiply(fattoreIva);
        return prezzoConIva.setScale(2, RoundingMode.HALF_UP);
    }


//    public BigDecimal getPrezzoScontato() {
////        BigDecimal sconto = getPrezzoConIva().multiply(new BigDecimal("0.02"));
////        BigDecimal prezzoScontato = getPrezzoConIva().subtract(sconto);

////        return prezzoScontato;

//        return getPrezzoConIva().multiply(new BigDecimal("0.98"));
//    }
    public BigDecimal getPrezzoScontato() {
        return getPrezzoConIva();
    }


    public void setPrezzo(BigDecimal  prezzo) {
        this.prezzo = prezzo;
    }

    public BigDecimal  getIva() {
        return iva;
    }

    public void setIva(BigDecimal  iva) {
        this.iva = iva;
    }


//    public double getPrezzoConIva() {
//        DecimalFormat df = new DecimalFormat("#.00");
//        double prezzoIva = prezzo + (prezzo * iva / 100);
//        return Double.parseDouble(df.format(prezzoIva).replace(',', '.'));
//    }
}

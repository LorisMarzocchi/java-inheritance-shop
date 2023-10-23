package org.lessons.java.shop;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    private final int codice = new Random().nextInt(99999999);
    private String nome;
    private String descrizione;
    private BigDecimal  prezzo;
//    quando si parla di soldi si usa BigDecimal
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

    public String getNomeCompleto(){
        return "Codice: " + getPaddedCodice() + " - Nome: " + nome + " - Prezzo: " + getPrezzoConIva();
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
        return prezzo.add(prezzo.multiply(iva));
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

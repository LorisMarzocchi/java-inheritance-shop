package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Prodotto {

    private final int codice = new Random().nextInt(99999999);
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;

    public Prodotto( String nome, String descrizione, double prezzo, double iva) {
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

    public double getPrezzoBase(){
        return prezzo;
    }

    public double getPrezzoConIva() {
        DecimalFormat df = new DecimalFormat("#.00");
        double prezzoIva = prezzo + (prezzo * iva / 100);
        return Double.parseDouble(df.format(prezzoIva).replace(',', '.'));
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
}

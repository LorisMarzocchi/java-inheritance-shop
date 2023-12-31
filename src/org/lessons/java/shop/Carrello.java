package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Carrello {

    private Prodotto[] prodotti = new Prodotto[100];
    private int numeroProdotti = 0;

    public BigDecimal calcolaTotale(boolean conTessera) {
        BigDecimal totale = BigDecimal.ZERO;
        for (int i = 0; i < numeroProdotti; i++) {
            totale = totale.add(prodotti[i].getPrezzoScontato());
        }

        if (conTessera) {
            BigDecimal scontoTessera = totale.multiply(new BigDecimal("0.02"));
            totale = totale.subtract(scontoTessera);
        }

//        System.out.println("Totale: " + totale);  // Stampa il totale
        return totale.setScale(2, RoundingMode.HALF_UP);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < numeroProdotti; i++) {
            s += prodotti[i].toString() + "\n";
        }
        return s;
    }


    public static void main(String[] args) {
        Carrello carrello = new Carrello();
        Scanner scanner = new Scanner(System.in);
        String risposta;


        System.out.println("Hai una tessera fedeltà? (s/n)");
        boolean conTessera = scanner.nextLine().equalsIgnoreCase("s");
        do {
            if (carrello.numeroProdotti >= 100) {
                System.out.println("Carrello pieno!");
                break;
            }

            System.out.println("Quale prodotto vuoi aggiungere? (1: Smartphone, 2: Televisore, 3: Cuffie)");
            int scelta = Integer.parseInt(scanner.nextLine());



            System.out.println("Inserisci nome del prodotto:");
            String nome = scanner.nextLine();
            System.out.println("Inserisci descrizione del prodotto:");
            String descrizione = scanner.nextLine();
            System.out.println("Inserisci prezzo del prodotto:");
            BigDecimal prezzo = new BigDecimal(scanner.nextLine());
            System.out.println("Inserisci IVA del prodotto:");
            BigDecimal iva = new BigDecimal(scanner.nextLine());

            Prodotto prodotto = null;

            switch (scelta) {
                case 1:
                    System.out.println("Inserisci IMEI:");
                    String imei = scanner.nextLine();
                    System.out.println("Inserisci memoria (in GB):");
                    int memoria = Integer.parseInt(scanner.nextLine());
                    prodotto = new Smartphone(nome, descrizione, prezzo, iva, imei, memoria);
                    break;
                case 2:

                    System.out.println("Inserisci altezza del televisore:");
                    int altezza = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci lunghezza del televisore:");
                    int lunghezza = Integer.parseInt(scanner.nextLine());
                    System.out.println("Il televisore è Smart TV? (s/n):");
                    boolean smartTv = scanner.nextLine().equalsIgnoreCase("s");
                    prodotto = new Televisore(nome, descrizione, prezzo, iva, altezza, lunghezza, smartTv);
                    break;
                case 3:
                    System.out.println("Inserisci colore delle cuffie:");
                    String colore = scanner.nextLine();
                    System.out.println("Le cuffie sono wireless? (s/n):");
                    boolean wireless = scanner.nextLine().equalsIgnoreCase("s");
                    prodotto = new Cuffie(nome, descrizione, prezzo, iva, colore, wireless);
                    break;

            }

                carrello.prodotti[carrello.numeroProdotti] = prodotto;
                carrello.numeroProdotti++;


//            if (prodotto != null) {
////                System.out.println("Prezzo prodotto: " + prodotto.getPrezzoConIva());
////                System.out.println("Prezzo prodotto con sconto: " + prodotto.getPrezzoScontato());
//            }


            System.out.println("Vuoi aggiungere un altro prodotto? (s/n)");
            risposta = scanner.nextLine();

        } while (!risposta.equalsIgnoreCase("n"));

        System.out.println("Prodotti nel carrello:");
        System.out.println(carrello);
        System.out.println("Tessera fedeltà applicata: " + conTessera);
        System.out.println("Totale: " + carrello.calcolaTotale(conTessera));


        scanner.close();
    }
}

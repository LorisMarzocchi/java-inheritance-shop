package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
    //  PRODOTTO 1
        Prodotto prodotto1 = new Prodotto("Prodotto1", "loremadsd", 16.9,20);
//        System.out.println("codice: " + prodotto1.getCodice() + " - " +
//                            "nome: " + prodotto1.getNome() + " - " +
//                            "descrizione: " + prodotto1.getDescrizione() + " - " +
//                            "prezzo con iva: " + prodotto1.getPrezzoConIva() + " - " +
//                            "prezzo: " + prodotto1.getPrezzo() + " - " +
//                            "iva: " + prodotto1.getIva()
//        );

    //  PRODOTTO 2
        Prodotto prodotto2 = new Prodotto("Prodotto2", "loremadsd", 19.9,10);
//        System.out.println("codice: " + prodotto2.getCodice() + " - " +
//                            "nome: " + prodotto2.getNome() + " - " +
//                            "descrizione: " + prodotto2.getDescrizione() + " - " +
//                            "prezzo con iva: " + prodotto2.getPrezzoConIva() + " - " +
//                            "prezzo: " + prodotto2.getPrezzo() + " - " +
//                            "iva: " + prodotto2.getIva()
//        );

    //  PRODOTTO 3
        Prodotto prodotto3 = new Prodotto("prodotto3", "loremadsd", 15.8,15);
//        System.out.println("codice: " + prodotto3.getCodice() + " - " +
//                "nome: " + prodotto3.getNome() + " - " +
//                "descrizione: " + prodotto3.getDescrizione() + " - " +
//                "prezzo con iva: " + prodotto3.getPrezzoConIva() + " - " +
//                "prezzo: " + prodotto3.getPrezzo() + " - " +
//                "iva: " + prodotto3.getIva()
//        );

        System.out.println(prodotto1.getNomeCompleto());
        System.out.println(prodotto2.getNomeCompleto());
        System.out.println(prodotto3.getNomeCompleto());


    }
}

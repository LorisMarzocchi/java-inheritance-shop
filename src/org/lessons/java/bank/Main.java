package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("inserisci il tuo nome: ");
        String nome = scan.nextLine();

        int nConto = new Random().nextInt(1000) + 1;

        Conto nuovoConto = new Conto(nConto, nome);
        String infoConto = nuovoConto.informazioniConto();
        System.out.println(infoConto);

        int scegli = 0;

        do {

            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Versare una somma");
            System.out.println("2. Prelevare una somma");
            System.out.println("3. Uscire");

            scegli = scan.nextInt();

            switch (scegli){
                case 1:
                    System.out.println("Inserisci la somma da versare: ");
                    double sommaVersamento = scan.nextDouble();
                    if (nuovoConto.versamento(sommaVersamento)) {
                        System.out.println("Operazione riuscita. Saldo attuale: " + nuovoConto.getSaldoFormattato());
                    } else {
                        System.out.println("Operazione fallita. Inserire una somma valida.");
                    }
                    break;

                case 2:
                    System.out.println("inserisci la somma da prelevare: ");
                    double sommaDaPrelevare = scan.nextDouble();
                    if (nuovoConto.prelievo(sommaDaPrelevare)){
                        System.out.println("Prelievo effettuato. Saldo attuale: " + nuovoConto.getSaldoFormattato());
                    }else {
                        System.out.println("Operazione fallita. Impossibile prelevare.");
                    }
                    break;
                case 3:
                    System.out.println("Arrivederci");
                    break;

                default:
                    System.out.println("Operazione non valida");

            }

        }while (scegli != 3);
        scan.close();
    }

}

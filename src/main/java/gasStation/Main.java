package gasStation;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.UK);

        Kuras kuras = new Kuras();
        kuras.setBenzinas("95");
        kuras.setBenzinoKaina(1.4F);
        kuras.setDyzelis("D");
        kuras.setDyzelioKaina(1.2F);
        kuras.setDujos("LPG");
        kuras.setDujuKaina(0.8F);

        System.out.println("Iveskite koloneles numeri: 1 - 3");
        byte kolonelesNr = scanner.nextByte();

        System.out.println("Pasirinkite degalus");

        System.out.println("A - benzinas " + kuras.getBenzinas() + ", " + kuras.getBenzinoKaina() + " eur/ltr");
        System.out.println("B - dyzelinas " + kuras.getDyzelis() + ", " + kuras.getDyzelioKaina() + " eur/ltr");
        System.out.println("C - dujos " + kuras.getDujos() + ", " + kuras.getDujuKaina() + " eur/ltr");

        char selection;
        float moketinaSuma;
        selection = scanner.next().charAt(0);

        System.out.println("Iveskite kuro kieki");
        float kuroKiekis = scanner.nextFloat();

        switch (selection) {
            case 'A':
                moketinaSuma = kuras.getBenzinoKaina() * kuroKiekis;
                System.out.println("_________________________________");
                System.out.println("Kuro cekis");
                System.out.println("Koloneles Nr: " + kolonelesNr);
                System.out.println("Kuras:        " + kuras.getBenzinas() + ", kaina - " + kuras.getBenzinoKaina() + " eur/ltr");
                System.out.println("Kuro kiekis:  " + kuroKiekis + " ltr");
                System.out.println("Viso moketi:  " + moketinaSuma + " eur");
                System.out.println("_________________________________");
                break;
            case 'B':
                moketinaSuma = kuras.getDyzelioKaina() * kuroKiekis;
                System.out.println("_________________________________");
                System.out.println("Kuro cekis");
                System.out.println("Koloneles Nr: " + kolonelesNr);
                System.out.println("Kuras:        " + kuras.getDyzelis() + ", kaina - " + kuras.getDyzelioKaina() + " eur/ltr");
                System.out.println("Kuro kiekis:  " + kuroKiekis + " ltr");
                System.out.println("Viso moketi:  " + moketinaSuma + " eur");
                System.out.println("_________________________________");
                break;
            case 'C':
                moketinaSuma = kuras.getDujuKaina() * kuroKiekis;
                System.out.println("_________________________________");
                System.out.println("Kuro cekis");
                System.out.println("Koloneles Nr: " + kolonelesNr);
                System.out.println("Kuras:        " + kuras.getDujos() + ", kaina - " + kuras.getDujuKaina() + " eur/ltr");
                System.out.println("Kuro kiekis:  " + kuroKiekis + " ltr");
                System.out.println("Viso moketi:  " + moketinaSuma + " eur");
                System.out.println("_________________________________");
                break;
        }
        //public static float getFuelTotalPriceForGasoline (float kiekis, float kaina){ //methodas paskaiciuoti kuro kaina
    }
}
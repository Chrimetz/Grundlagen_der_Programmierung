package Uebungsblatt_01;

import java.util.Scanner;

public class TravelCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Geben Sie die Anzahl der Kilometer ein, die Sie fahren möchten: ");
        int kilometer = input.nextInt();

        System.out.println("Geben Sie den Verbrauch Ihres Autos in Litern pro 100 Kilometer ein: ");
        double verbrauch = input.nextDouble();

        System.out.println("Geben Sie den Preis pro Liter Benzin ein: ");
        double preisProLiter = input.nextDouble();

        double kosten = (kilometer / 100.0) * verbrauch * preisProLiter;
        System.out.printf("Die Kosten für die Fahrt betragen: %.2f Euro%n", kosten);
    }
}

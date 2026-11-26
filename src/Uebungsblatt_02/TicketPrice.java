package Uebungsblatt_02;

import java.util.Scanner;

public class TicketPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie ihr alter ein: ");
        int alter = input.nextInt();

        if (alter < 5) {
            System.out.println("Der Eintritt ist kostenlos.");
        } else if (alter < 18) {
            System.out.println("Der Eintritt kostet 6 Euro.");
        } else if (alter < 65) {
            System.out.println("Haben Sie einen Studentenausweis? (ja/nein)");
            String studentenausweis = input.next();
            if (studentenausweis.equalsIgnoreCase("ja")) {
                System.out.println("Der Eintritt kostet 12 Euro.");
            } else {
                System.out.println("Der Eintritt kostet 15 Euro.");
            }
        } else {
            System.out.println("Der Eintritt kostet 10 Euro.");
        }
    }
}

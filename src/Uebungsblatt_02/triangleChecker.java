package Uebungsblatt_02;

import java.util.Scanner;

public class triangleChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Länge der ersten Seite ein: ");
        double a = input.nextDouble();
        System.out.println("Geben Sie die Länge der zweiten Seite ein: ");
        double b = input.nextDouble();
        System.out.println("Geben Sie die Länge der dritten Seite ein: ");
        double c = input.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Die Seitenlängen können ein Dreieck bilden.");
            if (a == b && b == c) {
                System.out.println("Es handelt sich um ein gleichseitiges Dreieck.");
            } else if (a == b || a == c || b == c) {
                System.out.println("Es handelt sich um ein gleichschenkliges Dreieck.");
            } else {
                System.out.println("Es handelt sich um ein ungleichseitiges Dreieck.");
            }
        } else {
            System.out.println("Die Seitenlängen können kein Dreieck bilden.");
        }
    }
}

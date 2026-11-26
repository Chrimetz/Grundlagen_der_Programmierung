package Uebungsblatt_04;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie das Jahr ein: ");
        int year = input.nextInt();
        System.out.println("Geben Sie den Monat ein (1-12): ");
        int month = input.nextInt();

        boolean isLeap = isLeapYear(year);
        System.out.println("Das Jahr " + year + " ist ein Schaltjahr: " + isLeap);
        int daysInMonth = getDaysInMonth(month, year);
        System.out.println("Der Monat " + month + " im Jahr " + year + " hat " + daysInMonth + " Tage.");

    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: // Januar
            case 3: // März
            case 5: // Mai
            case 7: // Juli
            case 8: // August
            case 10: // Oktober
            case 12: // Dezember
                return 31;
            case 4: // April
            case 6: // Juni
            case 9: // September
            case 11: // November
                return 30;
            case 2: // Februar
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Ungültiger Monat: " + month);
        }
    }
}

package Uebungsblatt_03;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein: ");
        int number = input.nextInt();

        int sum = 0;
        int product = 1;
        int count = 0;
        int temp = number;
        int reversed = 0;
        boolean isPalindrome = false;
        int maxDigit = Integer.MIN_VALUE;


        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            count++;
            temp /= 10;
            reversed = reversed * 10 + digit;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
        }

        double average = (double) sum / count;

        if (reversed == number) {
            isPalindrome = true;
        }

        System.out.println("Zahl: " + number);
        System.out.println("Summe der Ziffern: " + sum);
        System.out.println("Produkt der Ziffern: " + product);
        System.out.println("Anzahl der Ziffern: " + count);
        System.out.printf("Durchschnitt der Ziffern: %.2f%n", average);
        System.out.println("Ist Palindrom: " + isPalindrome);
        System.out.println("Größte Ziffer: " + maxDigit);
    }
}


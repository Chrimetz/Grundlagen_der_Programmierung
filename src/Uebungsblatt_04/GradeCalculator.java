package Uebungsblatt_04;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grade1 = readGrade(input);
        int grade2 = readGrade(input);
        double average = calculateAverage(grade1, grade2);
        String grade = calculateGrade(average);
        printResult(average, grade);
    }

    public static int readGrade(Scanner input) {
        System.out.println("Geben Sie die Note ein (1-6): ");
        int grade = input.nextInt();
        return grade;
    }

    public static double calculateAverage(int grade1, int grade2) {
        return (grade1 + grade2) / 2.0;
    }

    public static String calculateGrade(double average) {
        if (average >= 1.5) {
            return "Sehr gut";
        } else if (average >= 2.5) {
            return "Gut";
        } else if (average >= 3.5) {
            return "Befriedigend";
        } else if (average >= 4.0) {
            return "Ausreichend";
        } else if (average >= 5.0) {
            return "Mangelhaft";
        } else {
            return "Ungenügend";
        }
    }

    public static void printResult(double average, String grade) {
        System.out.printf("Der Durchschnitt beträgt: %.2f%n", average);
        System.out.println("Die Note ist: " + grade);
    }

}

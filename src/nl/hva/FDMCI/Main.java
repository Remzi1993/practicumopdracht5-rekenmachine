package nl.hva.FDMCI;

import java.util.Scanner;

/**
 * Het programma vraagt de gebruiker om een operator (+, -, *, / of %) en twee getallen en toont vervolgens de som,
 * inclusief antwoord, op het scherm.
 *
 * @author Remzi Cavdar - remzi.cavdar@hva.nl
 */

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char operator;
        do {
            System.out.print("Operator (S = stoppen): ");
            operator = input.next().charAt(0);

            if (operator == 'S') {
                break;
            } else if (!isGeldigeOperator(operator)) {
                System.out.println("Operator is ongeldig\n");
            } else {
                System.out.print("Eerste getal: ");
                double getal1 = input.nextDouble();

                System.out.print("Tweede getal: ");
                double getal2 = input.nextDouble();

                printBerekening(operator, getal1, getal2);
            }
        }
        while (operator != 'S');

    }

    static void printBerekening(char operator, double getal1, double getal2) {
        switch (operator) {
            case '+':
                double result = getal1 + getal2;
                System.out.printf("%.1f + %.1f = %.1f\n\n", getal1, getal2, result);
                break;
            case '-':
                result = getal1 - getal2;
                System.out.printf("%.1f - %.1f = %.1f\n\n", getal1, getal2, result);
                break;
            case '*':
                result = getal1 * getal2;
                System.out.printf("%.1f * %.1f = %.1f\n\n", getal1, getal2, result);
                break;
            case '/':
                result = getal1 / getal2;
                System.out.printf("%.1f / %.1f = %.1f\n\n", getal1, getal2, result);
                break;
            case '%':
                result = getal1 % getal2;
                System.out.printf("%.1f %% %.1f = %.1f\n\n", getal1, getal2, result);
                break;
            default:
                System.out.println("Operator is ongeldig");
        }
    }

    /**
     * Een method waarbij je een karakter als argument kan meegeven
     * @param karakter is een char die je als argument meegeeft
     * @return true of false. En true als het karakter uit de volgende karakters bestaat: +, -, *, / of %
     */
    static boolean isGeldigeOperator(char karakter) {
        return karakter == '+' || karakter == '-' || karakter == '*' || karakter == '/' || karakter == '%';
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public double getValidNumbers(Scanner scanner) {
        double a = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Skriv tal: ");
            try {
                a = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ugyldig indtastning. Skriv et tal.");
                scanner.next();
            }
        }

        return a;
    }


}

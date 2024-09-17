import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

            double a = calculator.getValidNumbers(scanner);
            double b = calculator.getValidNumbers(scanner);

        System.out.println("vælg operator +, -, *, /");

           switch (scanner.next()) {
               case "+":System.out.println(calculator.add(a, b)); break;
               case "-":System.out.println(calculator.subtract(a, b)); break;
               case "*":System.out.println(calculator.multiply(a, b)); break;
               case "/":System.out.println(calculator.divide(a, b)); break;
               default:
                   System.out.println("Ugyldigt input, prøv igen"); break;
           }
       }

    }

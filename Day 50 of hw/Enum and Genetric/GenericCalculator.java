
package calculator;
import java.util.Scanner;

class Calculator<T extends Number> {

    void add(T a, T b) {
        double result = a.doubleValue() + b.doubleValue();
        System.out.println("Addition Result: " + result);
    }

    void subtract(T a, T b) {
        double result = a.doubleValue() - b.doubleValue();
        System.out.println("Subtraction Result: " + result);
    }
}

public class GenericCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, type;

        do {
            System.out.println("\n===== GENERIC CALCULATOR =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {

                System.out.println("Select Data Type:");
                System.out.println("1. Integer");
                System.out.println("2. Double");
                System.out.print("Enter type: ");
                type = sc.nextInt();

                switch (type) {

                    case 1:
                        Calculator<Integer> intCal = new Calculator<>();
                        System.out.print("Enter first integer: ");
                        int a = sc.nextInt();
                        System.out.print("Enter second integer: ");
                        int b = sc.nextInt();

                        if (choice == 1)
                            intCal.add(a, b);
                        else
                            intCal.subtract(a, b);
                        break;

                    case 2:
                        Calculator<Double> doubleCal = new Calculator<>();
                        System.out.print("Enter first double: ");
                        double x = sc.nextDouble();
                        System.out.print("Enter second double: ");
                        double y = sc.nextDouble();

                        if (choice == 1)
                            doubleCal.add(x, y);
                        else
                            doubleCal.subtract(x, y);
                        break;

                    default:
                        System.out.println("Invalid Data Type!");
                }
            }

        } while (choice != 3);
    }
}

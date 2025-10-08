import java.util.Scanner;
import java.lang.Math;

class AdvancedCalculator {

    // Basic operations
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
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    // Scientific functions
    public double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double log(double a) {
        if (a <= 0) {
            System.out.println("Log undefined for 0 or negative numbers!");
            return 0;
        }
        return Math.log(a);
    }
}

public class AdvancedCalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdvancedCalculator calc = new AdvancedCalculator();

        System.out.println("Advanced OOP Calculator in Java (Console Version)" );
        System.out.println("Choose operation:" +  " ");
        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide" );
        System.out.println("5. Sin\n6. Cos\n7. Tan\n8. Square Root\n9. Log" );
        System.out.println(" Option you choose  :" + " ");
        int choice = sc.nextInt();
        double num1, num2, result ;

        switch (choice) {
            case 1:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = calc.add(num1, num2);
                break;
            case 2:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = calc.subtract(num1, num2);
                break;
            case 3:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = calc.multiply(num1, num2);
                break;
            case 4:
                System.out.print("Enter two numbers: ");
                num1 = sc.nextDouble();
                num2 = sc.nextDouble();
                result = calc.divide(num1, num2);
                break;
            case 5:
                System.out.print("Enter angle in degrees: ");
                num1 = sc.nextDouble();
                result = calc.sin(num1);
                break;
            case 6:
                System.out.print("Enter angle in degrees: ");
                num1 = sc.nextDouble();
                result = calc.cos(num1);
                break;
            case 7:
                System.out.print("Enter angle in degrees: ");
                num1 = sc.nextDouble();
                result = calc.tan(num1);
                break;
            case 8:
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                result = calc.sqrt(num1);
                break;
            case 9:
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                result = calc.log(num1);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
import java.util.Scanner;

public class MenuDrivenExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userChoice = 0;

        while (userChoice != 5) {
            System.out.println("\nEnter your calculator choice");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    add(sc);
                    break;
                case 2:
                    subtract(sc);
                    break;
                case 3:
                    multiply(sc);
                    break;
                case 4:
                    divide(sc);
                    break;
                case 5:
                    System.out.println("Thank you for using the calculator");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        sc.close();
    }

    private static void add(Scanner sc) {
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Sum is: " + (a + b));
    }

    private static void subtract(Scanner sc) {
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Difference is: " + (a - b));
    }

    private static void multiply(Scanner sc) {
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        System.out.println("Product is: " + (a * b));
    }

    private static void divide(Scanner sc) {
        System.out.println("Enter first number");
        double a = sc.nextDouble();
        System.out.println("Enter second number");
        double b = sc.nextDouble();
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        } else {
            System.out.println("Quotient is: " + (a / b));
        }
    }
}

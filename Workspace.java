1. InterfaceDemo

public class InterfaceDemo {
    public static void main(String[] args) {
        InheritClass obj = new InheritClass();
        obj.printSomething();
        obj.printsomething();
    }
}

interface InterfaceDemo1 {
    void printsomething();
}

interface InterfaceDemo2 {
    void printsomething();
}

class ParentParent {
    // add fields/methods here if you want
}

class InheritClass extends ParentParent implements InterfaceDemo1, InterfaceDemo2 {
    public void printSomething() {
        System.out.println("Printing Something");
    }

    @Override
    public void printsomething() {
        System.out.println("This is a method from InterfaceDemo1 and InterfaceDemo2");
    }
}

2. QueDemo
import java.util.LinkedList;
import java.util.Queue;
public class QueDemo {
    public static void main(String[] args) {
        Queue<String> users = new LinkedList<String>();
        users.offer("Hitler");
        users.offer("Stalin");
        users.offer("GT650");
        users.offer("Kawasaki Z900");
        while (!users.isEmpty()) {
            System.out.println(users.poll());
        }
        
    }  
}

3.StackDemo

import java.util.LinkedList;
public class StackDemo {
    public static void main(String[] args) {
        LinkedList<String> bucket = new LinkedList<String>();
        bucket.push("Toy1");
        bucket.push("Toy2");
        bucket.push("Toy3");
        bucket.push("Toy4");
        while (!bucket.isEmpty()) {
            System.out.println(bucket.pop());
        }
    }
}

4.AbstractDemo

class AbstractDEmo{
    public static void main(String[] args) {
        Calc1 C = new ImplementCalc();
       
    }

}
abstract class Calc1 {
    abstract void calculate(int a, int b); 
    void add(int a, int b){
        System.out.println(a + b);
    }

}
class ImplementCalc extends Calc1{
    void calculate(int a , int b ){
        System.out.println(a + b);
    }

}


5. Menu Driven Examples
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

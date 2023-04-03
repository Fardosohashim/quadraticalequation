package quadraticalequation;

import java.util.Scanner;

//R1=(-b+sqrt(b*b-4*a*C))/2*a
//R2=(-b-sqrt(b*b-4*a*c))/2*a
public class equation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value c: ");
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("The equation has two real roots: " + root1);
            System.out.println("The equation has two real roots: " + root2);

        } else if (d == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation is solve: " + root);
        } else {
            System.out.println("The equation cannot be solved:");
        }

    }
}
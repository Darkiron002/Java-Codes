import java.util.Scanner;
import java.util.Random;

public class quadRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("A Quadrativ equation looks like - ax²+bx+c");
        System.out.println("For the roots provide the coffecients !!");
        System.out.print("Enter the coff 'a':  ");
        double a = sc.nextInt();
        System.out.print("Enter the coff 'b': ");
        double b = sc.nextInt();
        System.out.print("Enter the coff 'c': ");
        double c = sc.nextInt();

        // Check if 'a' is zero
        if (a == 0) {
            System.out.println("Error: Coefficient 'a' cannot be zero for a quadratic equation!");
            sc.close();
            return;
        }

        double discr = Math.pow(b, 2) - 4 * a * c;

        // Checking  if discr is negative
        if (discr < 0) {
            System.out.println("Error: discr is negative! No real roots exist.");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discr) / (2 * a);
            System.out.println("Complex roots: " + realPart + " ± " + imaginaryPart + "i");
        } else {
            double alpha = (-b + Math.sqrt(discr)) / (2 * a);
            double beta = (-b - Math.sqrt(discr)) / (2 * a);
            System.out.println("The roots of the quadratic equation are " + alpha + " and " + beta);
        }



        sc.close();
    }
    
}

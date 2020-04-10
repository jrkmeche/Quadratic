import java.util.Scanner;


public class Quadratic {
    public static void main(String args[]) {
        //create a Scanner for keyboard entry and double variables for the coefficients
        Scanner keyboard = new Scanner(System.in);
        double a,b,c;

        //prompt the user for the coefficients of the equation
        System.out.println("Enter the coefficients of the quadratic equation (a,b,c):");
        System.out.println("a:");
        a = keyboard.nextDouble();
        System.out.println("b:");
        b = keyboard.nextDouble();
        System.out.println("c:");
        c = keyboard.nextDouble();

        //print the equation
        System.out.println("Equation: " + a+"x^2 + "+b+"x + "+c+" = 0");

        //compute the discriminant: b^2-4ac
        double discriminant = (b*b-4*a*c);
        System.out.println("Discriminant is " + discriminant);

        //calculate and print the real-number roots, if the discriminant is non-negative.
        if (discriminant >= 0) {
            System.out.println("The roots are real numbers:");
            double x1 = (-b - Math.sqrt(discriminant)) / (2*a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2*a);
            double xMin = Math.min(x1 , x2);
            double xMax = Math.max(x1 , x2);
            System.out.println("x = " + xMin);
            System.out.println("x = " + xMax);
        }

        //otherwise print a message that the roots are complex.
        else {
            System.out.println("The roots are complex numbers.");
        }

    }
} //end Quadratic

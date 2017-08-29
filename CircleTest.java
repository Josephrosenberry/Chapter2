
import java.util.Scanner;
/*************************************************************************************************************************
 * This is the driver program to create Circle objects
 * from the circle class.
 * @author Joseph
 * @version August 29, 2017
 * ***********************************************************************************************************************
 */
public class CircleTest
{
    public static void main(String[] args)
    {
        // Start scanner object
        Scanner scan = new Scanner(System.in);
        /*
         * Prompt user for radius and then create first
         * circle object. Calculate area and print
         */
        System.out.print("\fEnter the radius: ");
        double r = scan.nextDouble();
        Circle circle = new Circle(r);
        double area = circle.getArea();
        double circumference = circle.getCircumference();
        System.out.println("radius = " + r + "units" + " \narea = " + area + "units");
        System.out.println("circumference = " + circumference + "units");
        System.out.println();
        /*
         * Prompt user for radius and then create second
         * circle object. Calculate area and print
         */
        System.out.print("Enter another radius: ");
        double r2 = scan.nextDouble();
        Circle c2 = new Circle(r2); 
        area = c2.getArea();
        circumference = c2.getCircumference();
        System.out.println("Circle 2: radius = " + r2 + "units" + " \narea = " + area + "units");
        System.out.println("circumference = " + circumference + "units" );
        System.out.println();
        /*
         * Prompt user for radius and then create third
         * circle object. Calculate area and print
         */
        System.out.print("Enter another radius: ");
        double r3 = scan.nextDouble();
        Circle c3 = new Circle(r3);
        area = c3.getArea();
        circumference = c3.getCircumference();
        System.out.println("Circle 3: radius = " + r3 + "units" + " \narea = " + area + "units");
        System.out.println("circumference = " + circumference + "units");
    }
}
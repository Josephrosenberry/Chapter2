/**
 * Finding the distance between two points
 * @author Joseph Rosenberry
 * @version 9/4/2017
 */
import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        double x1, y1, x2, y2; // declares the points as doubles
        double distance; // declares the distance variable
        Scanner scan = new Scanner(System.in);
        // Read in the two points
        System.out.print("\fEnter the coordinates of the first point ");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.print("Enter the coordinates of the second point: ");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        // Compute the distance
        distance = Math.sqrt(Math.pow((x1-x2), 2)+ Math.pow((y1-y2), 2));
        // Print out the answer
        System.out.println("The distance between the two points is: " + distance);
    }
}
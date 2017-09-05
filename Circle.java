/****************************************************************************
 * This class represents a circle object.
 * Circles only know their radius and can calculate their Area and Circumference
 * @author Joseph Quinn Rosenberry III
 * @version August 29 2017
 * **************************************************************************
 */
public class Circle 
{
    // data section
    private double radius;
    // constructor section
    /****************************************************
     * Constructor method to create object
     * @param r the radius of a circle
     */
    public Circle(double r)
    {
        radius = r;
    }
    // method section
    /****************************************************
     * Function to calculate the area of the circle
     * @return returns the area of a circle 
     */
    public double getArea()
    {
        return Math.PI * radius * radius;

    }

    /****************************************************
     * Function to calculate the area of the circle
     * @return returns the area of a circle 
     */
    public double getCircumference()
    {
        return Math.PI * 2.0 * radius;
    }
}
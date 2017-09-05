public class Dice
{
    public static void main(String [] args)
    {
        int die1, die2;
        System.out.print ("\f");
        System.out.println ("First die: " + (die1 = (int) (Math.random() * 6) + 1));
        System.out.println ("Second die: " + (die2 = (int) (Math.random() * 6) + 1));
        System.out.println ("Sum of both die: " + (die1 + die2));
    }
}
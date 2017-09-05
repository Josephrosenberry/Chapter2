import java.util.Scanner; 
public class Main 
{
    public static void main (String[] args)
    {
        // define variables
        Scanner scan = new Scanner(System.in);
        double total, tax, tip;
        // print and scan total
        System.out.print("\fEnter the total $: ");
        total = scan.nextDouble();
        // prnt and scan tax
        System.out.print("Enter the tax %: ");
        tax = scan.nextDouble();

        System.out.print("Enter the tip %: ");
        tip = scan.nextDouble();

        System.out.println();
        System.out.println("\n******************************");
        System.out.printf("Meal Cost \t$%.2f" , total);
        System.out.printf("\nTax \t\t$%.2f" , .01*tax*total);
        System.out.printf("\nTip \t\t$%.2f" , .01*tip*total);
        System.out.println("\n------------------------------");
        System.out.println();
        System.out.printf("\nPlease Pay\t$%.2f", (total+(.01*tax*total) + (.01*tip*total)));

    
    }
}
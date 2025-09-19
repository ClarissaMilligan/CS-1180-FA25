import java.util.Scanner;

public class InputChecking
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many fish do you have?");

        while(!scnr.hasNextInt())
        {
            scnr.nextLine();
            System.out.println("That's not an int!!!");
            System.out.println("Give me an int!!!");
        }
        int numFish = scnr.nextInt();

        while (numFish < 0)
        {
            System.out.println("Give me positive number of fishies!!!");
            numFish = scnr.nextInt();
        }

        System.out.println("You have " + numFish + " fishies!");

//        if (scnr.hasNextInt())
//        {
//            System.out.println("fish");
//            int numFish = scnr.nextInt();
//        }
//        else
//        {
//            System.out.println("NO, BAD!");
//        }
    }
}

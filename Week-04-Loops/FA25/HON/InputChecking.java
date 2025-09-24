import java.util.Scanner;

public class InputChecking
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        boolean badUserInput = true;
        int numFishies = 0;

        while (badUserInput)
        {
            System.out.println("How many fish do you have?");

            if (scnr.hasNextInt())
            {
                numFishies = scnr.nextInt();
                if (numFishies >= 0)
                {
                    badUserInput = false;
                }
                else
                {
                    System.out.println("NO, BAD!");
                }
            }
            else
            {
                System.out.println("That's not an int!!!");
                System.out.println("Give me an int!!!");
            }
            scnr.nextLine();
        }
        System.out.println("You have " + numFishies + " fishies!");


        // original hasNextInt input looping
//        System.out.println("How many fish do you have?");
//
//        while(!scnr.hasNextInt())
//        {
//            scnr.nextLine();
//            System.out.println("That's not an int!!!");
//            System.out.println("Give me an int!!!");
//        }
//        int numFish = scnr.nextInt();
//
//        while (numFish < 0)
//        {
//            System.out.println("Give me positive number of fishies!!!");
//            numFish = scnr.nextInt();
//        }
//
//        System.out.println("You have " + numFish + " fishies!");

        // hasNextInt in if statement example
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

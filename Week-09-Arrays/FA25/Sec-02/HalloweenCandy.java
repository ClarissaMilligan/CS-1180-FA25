import java.util.Scanner;

public class HalloweenCandy
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many candy types are being counted?");
        int numCandyTypes = scnr.nextInt();
        scnr.nextLine();

        String[] candyNames = new String[numCandyTypes];

        for (int i = 0; i < numCandyTypes; i++)
        {
            System.out.println("Enter a candy name:");
            String candyType = scnr.nextLine();
            candyNames[i] = candyType;
        }

        System.out.println("How many trick or treaters?");
        int numToT = scnr.nextInt();

        // number of trick or treaters
        // number of each type of candy
        int[][] tOTCandyNums = new int[numToT][numCandyTypes];

        for (int i = 0; i < tOTCandyNums.length; i++)
        {
            System.out.println("Enter the numbers of each candy for trick or treater #" + (i+1));
            for (int j = 0; j < tOTCandyNums[i].length; j++)
            {
                System.out.println("Enter the number of " + candyNames[j]);
                int numCandy = scnr.nextInt();
                tOTCandyNums[i][j] = numCandy;
            }
        }
    }

    // write a method that calculates the total number of each candy type
    // print that info out in main
}

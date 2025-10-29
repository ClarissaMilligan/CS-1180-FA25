import java.util.Arrays;
import java.util.Scanner;

public class HalloweenArrayPractice
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many people are attending the party?");
        int numAttendees = scnr.nextInt();
        scnr.nextLine();

        String[] prompts = {"Please enter the food item you brought",
                "Please enter the costume you are wearing",
                "Please enter your favorite candy"};

        // two-dimensional arrays
        // each person will have a food item they brought, a costume, and a favorite candy
        String[][] peoplePartyContributions = new String[numAttendees][prompts.length];

        for (int i = 0; i < peoplePartyContributions.length; i++)
        {
            System.out.println("Party attendee #" + (i + 1));
            for (int j = 0; j < peoplePartyContributions[i].length; j++)
            {
                System.out.println(prompts[j]);
                String response = scnr.nextLine();
                peoplePartyContributions[i][j] = response;
            }
        }

        for (String[] person : peoplePartyContributions)
        {
            for (String prompt : person)
            {
                System.out.println(prompt);
            }
        }
    }
}

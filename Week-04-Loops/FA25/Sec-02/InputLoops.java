import java.util.Scanner;

public class InputLoops
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        boolean badUserInput = true;
        int numStudents = 0;

        while (badUserInput)
        {
            System.out.println("Enter the number of students in the class: ");
            if (scnr.hasNextInt())
            {
                numStudents = scnr.nextInt();

                if (numStudents >= 0)
                {
                    badUserInput = false;
                }
                else
                {
                    System.out.println("Input cannot be negative!! Please enter a positive integer.");
                }
            }
            else
            {
                System.out.println("That was not an integer!! Please enter an integer.");
            }
            scnr.nextLine();
        }
        System.out.println("There are " + numStudents + " students in the class.");
    }
}

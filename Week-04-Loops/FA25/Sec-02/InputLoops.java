import java.util.Scanner;

public class InputLoops
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter the number of students in the class: ");

        while (!scnr.hasNextInt())
        {
            scnr.nextLine();
            System.out.println("That was not an integer!! Please enter an integer.");
            System.out.println("Enter the number of students in the class: ");
        }
        int numStudents = scnr.nextInt();
        System.out.println("There are " + numStudents + " students in the class.");
    }
}

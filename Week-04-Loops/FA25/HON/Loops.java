import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many grades will you be entering??");
        int numGrades = scnr.nextInt();
        double totalGrades = 0;

//        for(int i = numGrades; i > 0; i--)
//        for(int i = 1; i <= numGrades; i++)
        for(int i = 0; i < numGrades; i++)
        {
            System.out.println("Enter grade #" + (i + 1));
            double grade = scnr.nextDouble();
            totalGrades = totalGrades + grade;
        }
        double avgGrade = totalGrades / numGrades;
        System.out.println("The average grade is: " + avgGrade);
    }
}

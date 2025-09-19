import java.util.Scanner;

public class Loops
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
//        System.out.println("How many grades will you be entering??");
//        int numGrades = scnr.nextInt();
//        double totalGrades = 0;
//
////        for(int i = numGrades; i > 0; i--)
////        for(int i = 1; i <= numGrades; i++)
//        for(int i = 0; i < numGrades; i++) // i++ is equivalent to i += 1 and i = i + 1
//        {
//            System.out.println("Enter grade #" + (i + 1));
//            double grade = scnr.nextDouble();
//            totalGrades = totalGrades + grade;
//        }
//        double avgGrade = totalGrades / numGrades;
//        System.out.println("The average grade is: " + avgGrade);
//
//        System.out.println("How many grades will you be entering??");
//        numGrades = scnr.nextInt();
//        totalGrades = 0;
//        int counter = 0;
//        while(counter < numGrades)
//        {
//            System.out.println("Enter grade #" + (counter + 1));
//            double grade = scnr.nextDouble();
//            totalGrades = totalGrades + grade;
//            counter++;
//        }
//        avgGrade = totalGrades / numGrades;
//        System.out.println("The average grade is: " + avgGrade);

        System.out.println("Type in any string: ");
        String s = scnr.nextLine();
        while (!s.equalsIgnoreCase("exit"))
        {
            s = scnr.nextLine();
        }

        System.out.println("Type in any string: ");
        for (s = scnr.nextLine(); !s.equalsIgnoreCase("exit"); s = scnr.nextLine())
        {
            System.out.println("keep typing!");
        }
    }
}

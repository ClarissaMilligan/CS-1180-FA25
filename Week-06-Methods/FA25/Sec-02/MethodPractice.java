import java.util.Random;

public class MethodPractice
{
    public static void main(String[] args)
    {
        Random rng = new Random();

        for(int i = 0; i < 10; i++)
        {
            System.out.println(rng.nextInt(1, 5));
        }

        int g1 = 23;
        double g2 = 55.9;
        double g3 = 100.0;
        double result = MethodPractice.avg(g1, g2, g3);
        System.out.println(result);

        long longG1 = 321973289;
        long longG2 = 328943891;
        long longG3 = 1910190909;
        long result2 = avg(longG1, longG2, longG3);
        System.out.println(result2);
    }

    public static double avg(double gradeOne, double gradeTwo, double gradeThree)
    {
        double avgGrade = (gradeOne + gradeTwo + gradeThree) / 3;
        return avgGrade;
        // unreachable code
        // System.out.println("hi!!!");
    }

    public static long avg(long gradeOne, long gradeTwo, long gradeThree)
    {
        return (gradeOne + gradeTwo + gradeThree) / 3;
    }

}

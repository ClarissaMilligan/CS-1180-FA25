public class FloatLoopProblems
{
    public static void main(String[] args)
    {
        int counter = 1;
        for (double i = 0.0; i < 1.0; i+=0.1)
        {
            System.out.println("Iteration #" + counter + ": i = " + i);
            counter++;
        }

        System.out.println();

        counter = 1;
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("Iteration #%d: i = %.1f\n", counter, (i * 0.1));
            counter++;
        }
    }
}

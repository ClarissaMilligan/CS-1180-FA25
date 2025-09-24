public class FloatingPointLoopControl
{
    public static void main(String[] args)
    {
        int counter = 1;
        for (double i = 0.0; i < 10; i += 0.1)
        {
            System.out.println("Loop iteration #" + counter + ": value is " + i);
            counter++;
        }

        System.out.println();

        counter = 1;
        for(int i = 0; i < 100; i++)
        {
            System.out.printf("Loop iteration #%d: value is %.1f\n", counter, (i * 0.1));
            counter++;
        }
    }
}

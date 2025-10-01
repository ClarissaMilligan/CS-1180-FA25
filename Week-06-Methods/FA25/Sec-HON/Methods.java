import java.util.Random;

public class Methods
{
    //static Random rng = new Random();
    public static void main(String[] args)
    {
        Random rng = new Random();
        for (int i = 0; i < 15; i++)
        {
            System.out.println(rng.nextInt(1,6));
        }
        System.out.println(passFail(rng));
        for (int i = 0; i < 100; i++)
        {
            System.out.println(Methods.improvedPassFail(70));
        }
    }

    public static boolean passFail(Random rng)
    {
        // Random rng = new Random();
        return rng.nextBoolean();
    }

    public static boolean improvedPassFail(int chance)
    {
        Random rng = new Random();
        int ran = rng.nextInt(100);
        if (ran < chance)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

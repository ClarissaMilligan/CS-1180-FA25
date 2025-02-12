public class LoopIssues
{
    public static void main(String[] args)
    {
        // scope
        int x = 0;

        while (x < 5)
        {
            int num = 3;
            x++;
        }
        // num is out of scope here.
        // x = num;
    }
}

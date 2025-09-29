public class NestedLoopPractice
{
    public static void main(String[] args)
    {
//        int counter = 1;
//        for (int i = 0; i < 10; i++)
//        {
//            System.out.println("just started outer loop iteration #" + i);
//            for (int j = 0; j < 5; j++)
//            {
//                System.out.println("\tjust started inner loop iteration #" + j);
//                for (int k = 0; k < 3; k++)
//                {
//                    System.out.println("\t\tjust started inner INNER loop iteration #" + k);
//                    System.out.println("\t\ttotal iterations:" + counter);
//                    counter++;
//                }
//                System.out.println("\tfinished inner loop iteration #" + j);
//            }
//            System.out.println("finished outer loop iteration #" + i);
//        }

        int width = 21;
        int height = 9;

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if (j == (width / 2) && i == (height / 2))
                {
                    System.out.print("@ ");
                }
                else if (((i % 2) == 0) && ((j % 2) == 0))
                {
                    System.out.print("* ");
                }
                else if (((i % 2) == 1) && ((j % 2) == 1))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

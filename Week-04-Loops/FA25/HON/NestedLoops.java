public class NestedLoops
{
    public static void main(String[] args)
    {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[35m";
//        int counter = 1;
//        for (int i = 0; i < 22; i++)
//        {
//            System.out.println("Start of i loop #" + i);
//            for (int j = 0; j < 3; j++)
//            {
//                System.out.println("\tStart of j loop #" + j);
//                for (int k = 0; k < 14; k++)
//                {
//                    System.out.println("\t\tStart of k loop #" + k);
//                    for (int l = 0; l < 20; l++)
//                    {
//                        System.out.println("\t\t\tStart of l loop #" + l);
//                        System.out.println("\t\t\tEnd of l loop #" + l);
//                        System.out.println("\t\t\ttotal number of iterations: " + counter);
//                        counter++;
//                    }
//                    System.out.println("\t\tEnd of k loop #" + k);
//                }
//                System.out.println("\tEnd of j loop #" + j);
//            }
//            System.out.println("End of i loop #" + i);
//        }

        int width = 27;
        int height = 27;

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                if ((j == (width / 2)) || (i == (height / 2)) || (i == j))
                {
                    System.out.print(YELLOW + "$ " + RESET);
                }
                else if ((i % 2) == 1 && (j % 2) == 0)
                {
                    System.out.print(RED + "& " + RESET);
                }
                else if ((i % 2) == 0 && (j % 2) == 1)
                {
                    System.out.print(BLUE + "& " + RESET);
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

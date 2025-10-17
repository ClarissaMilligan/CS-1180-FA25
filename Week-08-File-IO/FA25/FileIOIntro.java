import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileIOIntro
{
    public static void main(String[] args) throws IOException
    {
        boolean badInput = true;
        Scanner scnr = new Scanner(System.in);

//        for (int i = 0; i < 10; i++)
//        {
//            FileWriter fw = new FileWriter("Hello" + i + ".txt", true);
//            PrintWriter pw = new PrintWriter(fw);
//            pw.println("File #" + i);
//            for (int j = 0; j < 10; j++)
//            {
//                pw.println(j);
//            }
//            pw.close();
//            fw.close();
//        }

        while (badInput)
        {
            try
            {
                System.out.println("Type the name of the file you want to read from: ");
                int fileNum = scnr.nextInt();
                String fileName = "Hello" + fileNum + ".txt";

                System.out.println(55 / fileNum);

                File fileHandle = new File(fileName);
                Scanner fileScnr = new Scanner(fileHandle);

                badInput = false;

                while (fileScnr.hasNextLine())
                {
                    String lineOne = fileScnr.nextLine();
                    System.out.println(lineOne);
                }
            }
            catch (FileNotFoundException fnfe)
            {
                System.out.println("That file does not exist!");
            }
            catch (InputMismatchException ime)
            {
                System.out.println("You need to type in a number!");
                scnr.nextLine();
            }
            catch (Exception e)
            {
                System.out.println("Something unexpected occurred!");
            }
            finally
            {
                System.out.println("END OF LOOP");
            }
        }
    }
}

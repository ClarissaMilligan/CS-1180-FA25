import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class HONFileIO
{
    public static void main(String[] args) throws IOException
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scnr.nextLine();

        int age = 0;
        double toes = 0.0;
        boolean invalidInput = true;

        while (invalidInput)
        {
            try
            {
                System.out.println("How old are you?");
                age = scnr.nextInt();
                invalidInput = false;

            } catch (InputMismatchException ime)
            {
                System.out.println("You need to enter an integer!");
                scnr.nextLine();
            }
        }
        invalidInput = true;
        while (invalidInput)
        {
            try
            {
                System.out.println("How many toes do you have?");
                toes = scnr.nextDouble();
                invalidInput = false;
            }
            catch (Exception e)
            {
                System.out.println("You need to enter an number!");
                scnr.nextLine();
            }
        }
        String log = name + "\n" + age + "\n" + toes;
        logData(log);

        System.out.println("What is the number of the log you want to read?");
        int fileNum = scnr.nextInt();
        String fileName = "log-" + fileNum + ".txt";
        File fileHandle = new File(fileName);
        Scanner fileScnr = new Scanner(fileHandle);
        int i = 0;
        while (fileScnr.hasNextLine())
        {
            System.out.println("line #" + i + ": " + fileScnr.nextLine());
            i++;
        }

    }

    public static void logData(String data) throws IOException
    {
        Random rng = new Random();
        int num = rng.nextInt(10);
        System.out.println(num);
        FileWriter fw = new FileWriter("log-" + num + ".txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(data);
        pw.close();
        fw.close();
    }
}

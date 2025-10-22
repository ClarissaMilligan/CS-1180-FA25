import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class HONFileIO
{
    public static void main(String[] args)
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

        int fileNum = 0;
        invalidInput = true;
        try
        {
            String log = name + "\n" + age + "\n" + toes;
            logData(log);
        }
        catch (IOException ioe)
        {
            System.out.println("something bad happened.");
        }

        while(invalidInput)
        {
            try
            {
                System.out.println("What is the number of the log you want to read?");
                fileNum = scnr.nextInt();
                String fileName = "log-" + fileNum + ".txt";
                readFile(fileName);
                invalidInput = false;
            }
            catch (InputMismatchException ime)
            {
                System.out.println("You must enter an integer!!!");
                scnr.nextLine();
            }
            catch (IOException ioe)
            {
                if (fileNum < 0)
                {
                    System.out.println("File number cannot be negative.");
                }
                else if (fileNum > 9)
                {
                    System.out.println("File number cannot be greater than 9.");
                }
                else
                {
                    System.out.println("Invalid file number");
                }
            }
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

    public static void readFile(String fileName) throws FileNotFoundException
    {
        File fileHandle = new File(fileName);
        Scanner fileScnr = new Scanner(fileHandle);
        int i = 0;
        while (fileScnr.hasNextLine())
        {
            System.out.println("line #" + i + ": " + fileScnr.nextLine());
            i++;
        }
    }
}

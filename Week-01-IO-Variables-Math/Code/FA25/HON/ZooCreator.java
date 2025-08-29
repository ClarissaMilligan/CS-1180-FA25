import java.util.Scanner;

public class ZooCreator
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        //String zooName = "Cool Zoo";
        System.out.println("Type in the name of your zoo:");
        String zooName = scnr.nextLine();
        zooName = zooName.toUpperCase();
        System.out.println("Welcome to " + zooName);

        System.out.println("How many animals are in your zoo?");
        int numAnimals = scnr.nextInt();
        System.out.println(zooName + " has " + numAnimals + " animals!");

        System.out.println("How tall is your giraffe?");
        double giraffeHeight = scnr.nextDouble();
    }
}

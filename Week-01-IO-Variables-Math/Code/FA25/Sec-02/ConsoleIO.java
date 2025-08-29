import java.util.Scanner;

public class ConsoleIO
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name);
        System.out.println("How old are you?");
        double age = input.nextDouble();

        System.out.println(age % 2);

        System.out.println("You are " + (age * 2) + " years old.");

        System.out.println("4 times 4 is: " + (4 * 4));

        System.out.println("Enter the radius of a circle:");
        double radius = input.nextDouble();

        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.printf("The area of the circle is: %.2f\n", circleArea);
        //System.out.println("The area of the circle is: " + circleArea);

        System.out.println("\n\n\n\t\"Hello\\Hi!\" Bob said.");
    }
}

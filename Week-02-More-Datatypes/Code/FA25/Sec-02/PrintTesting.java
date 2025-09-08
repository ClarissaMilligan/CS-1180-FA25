import java.util.Scanner;

public class PrintTesting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Hi");
        System.out.print("How are you?");

        System.out.println("\nHi");
        System.out.println("How are you?");

        int hugeNumber = 2147483647;
        System.out.println(hugeNumber);
        hugeNumber = hugeNumber + 1;
        System.out.println(hugeNumber);
        hugeNumber = hugeNumber * 3;
        System.out.println(hugeNumber);

        System.out.println("Enter your speed in kmh: ");
        double kmh = input.nextDouble();
        double mph = kmh * ((double) 1000/1609);
        // all of these are valid ways to prevent integer division
        // and cast the literals to doubles
        //double mph = kmh * (1000./1609);
        //double mph = kmh * (1000/1609.);
        //double mph = kmh * (1000.0/1609);
        System.out.println("Your speed in mph is: " + mph);

        // if a data conversion would lose information
        // in this case the .543
        // Java will not allow it by default
        // instead we have to force a type conversion
        // via type-casting
        int num = (int) 6.543;
        System.out.println(num);

        // java will support "non-lossy" conversions
        // if i convert an int to a double
        // im not losing any information
        // so java will convert by default
        double decimal = 4;
        System.out.println(decimal);
    }
}

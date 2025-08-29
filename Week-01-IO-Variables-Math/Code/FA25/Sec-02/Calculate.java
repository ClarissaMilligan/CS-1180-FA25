import java.util.Scanner;

public class Calculate
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Tell me the radius of the shape:");

        double r = scnr.nextDouble();
        double circleArea = Math.PI * Math.pow(r, 2);
        System.out.printf("The area of the circle is: %.2f\n", circleArea);

        double sphereVolume = (4/3.0) * Math.PI * Math.pow(r, 3);
        System.out.printf("The volume of the sphere is: %.3f", sphereVolume);
    }
}

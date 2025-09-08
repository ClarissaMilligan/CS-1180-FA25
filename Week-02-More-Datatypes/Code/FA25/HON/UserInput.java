import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("give me your age: ");
        int age = scnr.nextInt();

        System.out.println("give me your name! ");
        scnr.nextLine();
        String name = scnr.nextLine();

        System.out.println(name + " is " + age + " years old.");

    }
}

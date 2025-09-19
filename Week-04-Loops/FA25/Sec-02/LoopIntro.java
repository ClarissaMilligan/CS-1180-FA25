import java.util.Scanner;

public class LoopIntro
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Continue to type 'a' to continue looping");
        char input = scnr.next().charAt(0);

        // since i don't know how many times the user will enter 'a'
        // a while loop is generally a better choice
        while (input == 'a')
        {
            System.out.println("we are going to keep looping!!");
            System.out.println("Type another letter:");
            input = scnr.next().charAt(0);
        }

        System.out.println("Welcome!");
        System.out.println("Continue to type 'a' to continue looping");
        input = scnr.next().charAt(0);

        // this is equivalent to the while loop above
        // i can omit the initialization or update steps if i want to
        // but then i might as well use a for loop
        for (; input == 'a';)
        {
            System.out.println("we are going to keep looping!!");
            System.out.println("Type another letter:");
            input = scnr.next().charAt(0);
        }

        // i don't know exactly how many letters to print
        // BUT the user will tell me and i can store that in a variable
        // therefore, a for loop is a better choice here
        System.out.println("How many letters do you want printed?");
        int numLetters = scnr.nextInt();

        char letter = 'a';
        // each of these loop headers will have the same function
        // three ways of writing the same thing
//        for (int i = numLetters; i > 0; i--)
//        for (int i = 1; i <= numLetters; i++)
        for (int i = 0; i < numLetters; i++) // i++ is the same as i += 1 and i = i + 1
        {
            System.out.println(letter);
            letter++;
        }

        int counter = 0;
        letter = 'a';
        while (counter < numLetters)
        {
            System.out.println(letter);
            letter++;
            counter = counter + 1;
        }
    }
}

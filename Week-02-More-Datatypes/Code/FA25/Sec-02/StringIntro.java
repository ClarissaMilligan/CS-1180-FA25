import java.util.Scanner;

public class StringIntro
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        System.out.println("give me a 5-letter word: ");
        String word = scnr.next();

        System.out.println("The middle 3 characters of your word are: ");
        String midThree = word.substring(1, 4);
        System.out.println(midThree);

        System.out.println("Give me a number between 0 and 4 inclusive: ");
        int index = scnr.nextInt();
        char letter = word.charAt(index);
        System.out.println("The letter at index " + index + " is " + letter);

        letter++;
        System.out.println(letter);
        char randomLetter = 65;
        System.out.println(randomLetter);

        System.out.println("Give me a character: ");
        char c = scnr.next().charAt(0);
        int i = word.indexOf(c);
        System.out.println("The character " + c + " is at index " + i);
    }
}

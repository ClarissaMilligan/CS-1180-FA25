public class HelloClass // this is my class
{
    // this is the main method where
    // my compiler knows where to start
    public static void main(String[] args)
    {
        /*
        it's a lot easier to
        write multi-line comments
        with a block comment
         */
        System.out.println("Hello and Welcome to Class!");
        // variable creation and initialization can be split
        int age;
        //System.out.println(age);
        age = 38;

        // but often times we prefer to do them at the same time
        int bobsAge = 55;
        System.out.println(bobsAge);

        double myFavDecimalValue = 8.8;

        boolean isInstructor = true;
        isInstructor = false;

        char firstLetterOfName = 'c';

        String alphabet = "AbfsnjkAeDHKFHkevbh";

        alphabet = alphabet.toLowerCase();

        System.out.println(alphabet);
    }
}

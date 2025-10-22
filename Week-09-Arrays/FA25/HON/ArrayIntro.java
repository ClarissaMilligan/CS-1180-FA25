import java.util.Arrays;

public class ArrayIntro
{
    public static void main(String[] args)
    {
        String name = "Brycen";
        char[] nameLetters = new char[name.length()];

        for (int i = 0; i < nameLetters.length; i++)
        {
            nameLetters[i] = name.charAt(i);
        }
        System.out.println(nameLetters);

        int[] ages = new int[25];
        ages[0] = 18;
        ages[1] = 34;
        ages[2] = 43;
        ages[3] = 2;
        System.out.println(ages);
        System.out.println(Arrays.toString(ages));

        // Both will cause ArrayIndexOutOfBoundsExceptions
        // System.out.println(ages[-1]);
        // System.out.println(ages[25]);

        // shallow copy: copies the reference but not the actual contents of the array
        int[] collegeAges = ages;
        System.out.println("BEFORE");
        System.out.println("original ages: " + Arrays.toString(ages));
        System.out.println("college ages: " + Arrays.toString(collegeAges));

        collegeAges[10] = 19;
        ages[15] = 15;

        System.out.println("AFTER");
        System.out.println("original ages: " + Arrays.toString(ages));
        System.out.println("college ages: " + Arrays.toString(collegeAges));

        // deep copy: copies the contents of the array to a new array
        collegeAges = ages.clone();
        collegeAges[8] = 88;
        ages[9] = 99;

        System.out.println("AFTER CLONE");
        System.out.println("original ages: " + Arrays.toString(ages));
        System.out.println("college ages: " + Arrays.toString(collegeAges));

        int[] otherAges = {1, 2, 4, 6, 2};
        collegeAges = otherAges.clone();
        System.out.println(Arrays.toString(collegeAges));

    }
}

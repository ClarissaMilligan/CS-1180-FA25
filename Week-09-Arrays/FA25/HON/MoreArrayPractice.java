import java.sql.Array;
import java.util.*;

public class MoreArrayPractice
{
    public static void main(String[] args)
    {
        Object[] stuff = {new Scanner(System.in), "hello", 5.8, 2, true};

        System.out.println(Arrays.toString(stuff));
        // can use casting to get around limitations of Object
        // but i have to be very careful to cast to the correct type
        // (generally not good/safe style)
        System.out.println(((String)stuff[1]).toUpperCase());
        // System.out.println(stuff[2] + stuff[3]);

        if (stuff[1] instanceof String)
        {
            stuff[1] = ((String) stuff[1]).toUpperCase();
        }
        System.out.println(stuff[1]);


        // represents 4 courses of 50 students
        // String[][] courseLists = new String[4][50];
        String[][] courseLists = {new String[35], new String[27], new String[45], new String[55]};
        courseLists[0][0] = "Bradyn";
        courseLists[0][1] = "Sam";
        courseLists[0][2] = "Olivia";
        courseLists[0][3] = "Luke";

        courseLists[1][0] = "Bradyn";

        System.out.println(Arrays.toString(courseLists));

        for (String[] s : courseLists)
        {
            System.out.println(Arrays.toString(s));
        }

        for (int i = 0; i < courseLists.length; i++)
        {
            for (int j = 0; j < courseLists[i].length; j++)
            {
                System.out.println(courseLists[i][j]);
            }
        }


//        ArrayList everything = new ArrayList();
//        everything.add(false);
//        everything.add(8.4);
//        everything.add("bob");
//        everything.add(4);
//
//        System.out.println(everything.get(1) + everything.get(3));

        ArrayList<String> table6 = new ArrayList<>();
        table6.add("AJ");
        table6.add("Cole");
        table6.add("Sofia");
        table6.add(0, "Thieny");
        table6.addLast("Dhurba");

        System.out.println(table6);

        ArrayList<Integer> classSizes = new ArrayList<>();
        classSizes.add(9);
        classSizes.add(10);
    }
}

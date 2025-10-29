import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoreArrays
{
    public static void main(String[] args)
    {
        Random rng = new Random();
        Object[] stuff = new Object[5];

        stuff[0] = true;
        stuff[1] = "hello";
        stuff[2] = 'a';
        stuff[3] = 5;
        stuff[4] = 5.4;

        System.out.println(Arrays.toString(stuff));
        // if i don't cast to a String
        // the compiler won't know what data type the value at index 1 is
        // so it won't let us call any method that doesn't exist in Object
        System.out.println(((String) stuff[1]).toUpperCase());

        // represents the gpas of students in a set of classes
        // there are 4 classes with ~50 students each
        double[][] classGPAs = {new double[45], new double[53], new double[35], new double[27]};

        classGPAs[0][0] = 3.8;
        classGPAs[0][1] = 4.0;
        classGPAs[0][2] = 2.7;

        for (int i = 0; i < classGPAs.length; i++)
        {
            for (int j = 0; j < classGPAs[i].length; j++)
            {
                double ranGPA = rng.nextDouble(4.1);
                classGPAs[i][j] = Math.round((ranGPA * 10)) / 10.0;
            }
        }

        System.out.println(Arrays.toString(classGPAs));

        for (double[] arr : classGPAs)
        {
            System.out.println(Arrays.toString(arr));
        }

        ArrayList<String> classList = new ArrayList<>();
        classList.add("Clarissa");
        classList.add("Barsha");
        classList.add("Mia");

        System.out.println(classList);
        System.out.println(classList.get(0));
        System.out.println(classList.get(0).toUpperCase());

        ArrayList<Integer> ages = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            ages.add(rng.nextInt(100));
        }
        System.out.println(ages);
    }
}

import java.util.Arrays;

public class ArrayPractice
{
    public static void main(String[] args)
    {
        String[] compSciUIDs = new String[10];
        compSciUIDs[0] = "U00425078";
        compSciUIDs[8] = "U00528749";
        compSciUIDs[4] = "U01738582";
        // both of these produce an ArrayIndexOutOfBoundsException
        // compSciUIDs[-1] = "U00528749";
        // compSciUIDs[10] = "U01738582";

        System.out.println(compSciUIDs);
        System.out.println(Arrays.toString(compSciUIDs));

        for (int i = 0; i < compSciUIDs.length; i++)
        {
            System.out.println(compSciUIDs[i]);
        }

        String[] engineeringUIDS = compSciUIDs;

        System.out.println("BEFORE MODIFICATION");
        System.out.println("comp sci: " + Arrays.toString(compSciUIDs));
        System.out.println("eng: " + Arrays.toString(engineeringUIDS));

        compSciUIDs[1] = "U01339874";
        engineeringUIDS[5] = "U01328974";

        System.out.println("AFTER MODIFICATION");
        System.out.println("comp sci: " + Arrays.toString(compSciUIDs));
        System.out.println("eng: " + Arrays.toString(engineeringUIDS));

        engineeringUIDS = compSciUIDs.clone();
        compSciUIDs[2] = "XXX";
        engineeringUIDS[3] = "YYY";

        System.out.println("AFTER CLONING AND MODIFICATION");
        System.out.println("comp sci: " + Arrays.toString(compSciUIDs));
        System.out.println("eng: " + Arrays.toString(engineeringUIDS));

        System.out.println(compSciUIDs[1].indexOf("0"));
    }
}

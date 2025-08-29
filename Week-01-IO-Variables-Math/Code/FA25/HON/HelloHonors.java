public class HelloHonors
{
    // this is the main method
    // this is where the compiler knows to start
    public static void main(String[] args)
    {
        /*
        block comments give me a better way
        of writing multi-line comments
         */
        System.out.println("Hello honors class!!!"); // i can also put a comment at the end of a line

        int numOfCows;
        numOfCows = 7;
        System.out.println(numOfCows);

        int numOfSheep = 8;
        System.out.println(numOfSheep);

        int numOfPigs = 5;
        System.out.println(numOfPigs);

        boolean isFarmOpen = true;
        isFarmOpen = false;

        double pigWeightLB = 55.6;

        //char areThereVisitors = 66;
        char areThereVisitors = 'y';
        System.out.println(areThereVisitors);

        int totalNumAnimals = numOfCows + numOfSheep + numOfPigs;
        System.out.println("The total number of animals on the farm is " + totalNumAnimals);

        double pigWeightKG = pigWeightLB / 2.205;
        System.out.print("weight in lbs: " + pigWeightLB + " ");
        System.out.printf("weight in kgs: %.2f", pigWeightKG);

        // V = 4/3 π r³
        double pigVolume = (4.0/3) * Math.PI * Math.pow(1, 3);
        String pigName = "Burt";
        String volumeString = String.format(" %s's volume: %.3f", pigName, pigVolume);
        System.out.println(volumeString);

        long reallyBigNum = 437543873;
        System.out.printf("%0,20d", reallyBigNum);

        System.out.println("\n\t\"Hi everyone!\" said " + pigName + ".");
        System.out.println("My 'favorite' class is CS-1180\\Java Programming");
    }
}

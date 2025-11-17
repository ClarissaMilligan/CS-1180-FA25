public class Driver
{
    public static void main(String[] args)
    {
        Cake cakeOne = new Cake();
        // can only do if flavor is public
        // System.out.println(cakeOne.flavor);

        Cake cakeTwo = new Cake(4.5, 3, 3, "chocolate", true);
        System.out.println(cakeOne);
        System.out.println(cakeTwo);
        System.out.println(cakeTwo.getVolume());
        // System.out.println(cakeOne.diameter);

        CircularDessert cd = new CircularDessert();
        System.out.println(cd);

        Pie bananaCreamPie = new Pie(5, 2, "regular", "banana cream", false, true);
        System.out.println(bananaCreamPie.getVolume());
        System.out.println(bananaCreamPie);
    }
}
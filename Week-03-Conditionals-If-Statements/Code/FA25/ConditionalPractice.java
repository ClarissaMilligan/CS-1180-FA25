public class ConditionalPractice
{
    public static void main(String[] args)
    {
        String name = new String("Clarissa");
        String name2 = new String("Clarissa");

        // equality operator should not be used with Objects
        // in this case, specifically String objects
        if (name == name2)
        {
            System.out.println("These are the same");
        }
        else
        {
            System.out.println("These are not the same");
        }

        // instead we use the equals() method
        // or alternatively equalsIgnoreCase()
        if (name.equals(name2))
        {
            System.out.println("These are the same");
        }
        else
        {
            System.out.println("These are not the same");
        }
    }
}

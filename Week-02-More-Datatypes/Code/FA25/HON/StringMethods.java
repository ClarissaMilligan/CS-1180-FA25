public class StringMethods
{
    public static void main(String[] args)
    {
        String s = "word";

        System.out.println(s.substring(1, 3));

        char c = s.charAt(3);
        System.out.println(c);

//        c = s.charAt(5);
//        System.out.println(c);

        boolean b = s.contains("hi");
        System.out.println(b);
    }
}

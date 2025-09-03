public class Overflow
{
    public static void main(String[] args)
    {
        int reallyBig = 2147483647;
        System.out.println(reallyBig);
        reallyBig = reallyBig / 2;
        System.out.println(reallyBig);
        reallyBig = reallyBig * 3;
        System.out.println(reallyBig);

//        reallyBig = reallyBig + 1;
//        System.out.println(reallyBig);
//        reallyBig = reallyBig * 3;
//        System.out.println(reallyBig);
    }
}

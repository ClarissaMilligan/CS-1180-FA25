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

        double answer = 9 / 3;
        System.out.println(answer);
        answer = 9 / 2;
        System.out.println(answer);
        answer = 9. / 2;
        // answer = 9 / 2.;
        // answer = 9.0 / 2;
        System.out.println(answer);

        answer = (double) 9 / 4;
        System.out.println(answer);

        // java will allow non-lossy conversions
        double definitelyADecimal = 4;
        System.out.println(definitelyADecimal);

        // by default java does not allow lossy conversion
        //int definitelyNOTADecimal = 4.5439532;
        // we can force a lossy conversion by type-casting
        // java will not round a lossy conversion, it truncates
        // (gets rid of everything after the .)
        int definitelyNOTADecimal = (int) 4.999;
        System.out.println(definitelyNOTADecimal);

        // f indicates a float decimal value
        // float is less precise than double
        // so this is not a lossy conversion
        double deci = 0.6f;

        // without the f, java recognizes decimals as doubles
        // so this is considered a potentially lossy conversion
        // float floaty = 0.6;
    }
}

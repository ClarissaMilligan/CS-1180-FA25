public class CarMain
{
    public static void main(String[] args)
    {
        Car c1 = new Car();
        Car customCar = new Car("blue", 69, 55.3, 25.0, 389.6);
        // can't do this unless mpg is public
        // c1.mpg = 5.5;

        System.out.println(c1);
        System.out.println(customCar);
        System.out.println(customCar.getTankSize());
    }
}

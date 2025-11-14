public class CarMain
{
    public static void main(String[] args)
    {
        Vehicle v1 = new Vehicle();
        Vehicle customVehicle = new Vehicle("blue", 69, 55.3, 25.0, 389.6);
        // can't do this unless mpg is public
        // v1.mpg = 5.5;

        System.out.println(v1);
        System.out.println(customVehicle);
        System.out.println(customVehicle.getTankSize());

        SemiTruck semiOne = new SemiTruck();
        System.out.println(semiOne.getColor());
    }
}

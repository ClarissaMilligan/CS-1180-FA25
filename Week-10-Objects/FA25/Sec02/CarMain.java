import java.util.ArrayList;

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
        System.out.println(semiOne);
        System.out.println(semiOne.getColor());

        Car carOne = new Car();
        System.out.println(carOne);

        EV ev = new EV();

        // example #1 of polymorphism
        ArrayList<Vehicle> highway = new ArrayList<>();
        highway.add(v1);
        highway.add(customVehicle);
        highway.add(carOne);
        highway.add(semiOne);
        highway.add(ev);

        System.out.println(highway);
        for (Vehicle v : highway)
        {
            System.out.println(v.getTankSize());
        }

        System.out.println(vehicleScoreCalculator(carOne));
        System.out.println(vehicleScoreCalculator(ev));
        System.out.println(vehicleScoreCalculator(semiOne));
    }

    // example #2 of polymorphism
    public static double vehicleScoreCalculator(Vehicle v)
    {
        // can't call because it only exists in the semi class
        // v.getHaulingCapacity();
        // can call all of these because they exist in the vehicle class
        return (v.getMaxRange() + v.getSafetyRating() - v.getMpg()) * v.getTankSize();
    }
}

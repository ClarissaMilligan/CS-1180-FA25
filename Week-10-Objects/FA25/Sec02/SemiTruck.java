public class SemiTruck extends Vehicle
{
    private double haulingCapacity = 0.0;

    public SemiTruck()
    {
        super();
        haulingCapacity = Math.round(super.getRng().nextDouble(500.0, 2500.0) * 100) / 100.0;
    }
}

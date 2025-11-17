public class SemiTruck extends Vehicle
{
    private double haulingCapacity = 0.0;

    public SemiTruck()
    {
        // we don't have to explicitly call super()
        // to call the no-arg constructor of the parent class
        // but it is good style to do so
        super();
        haulingCapacity = Math.round(super.getRng().nextDouble(500.0, 2500.0) * 100) / 100.0;
    }

    @Override
    public String toString()
    {
        return super.getColor() + " semi-truck:" +
                "\ntop speed: " + super.getTopSpeed() +
                "\nsafety rating: " + getSafetyRating() + // don't have to use the super keyword in this case
                "\nmpg: " + super.getMpg() +
                "\nmax range: " + super.getMaxRange() +
                "\nhauling capacity: " + haulingCapacity;
    }

    public double getHaulingCapacity()
    {
        return haulingCapacity;
    }

    public void setHaulingCapacity(double haulingCapacity)
    {
        if (haulingCapacity > 0)
        {
            this.haulingCapacity = haulingCapacity;
        }
    }
}


public class Car extends Vehicle
{
    private int numOfPassengers = 0;

    public Car()
    {
        numOfPassengers = getRng().nextInt(1, 12);
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nnumber of passengers: " + numOfPassengers;
    }
}

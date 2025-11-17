import java.util.*;

public class CircularDessert
{
    public final static double PI = 3.1415926;
    private Random rng = new Random();

    private double diameter = 0.0;
    private double height = 0.0;
    private String flavor = "";
    private boolean containsAllergens = false;

    private ArrayList<String> possibleFlavors = new ArrayList<>(Arrays.asList("Vanilla", "Chocolate", "Strawberry"));

    public CircularDessert()
    {
        // this would bypass our setters and encapsulation
//        this.diameter = diameter;
        diameter = rng.nextDouble(0.0, 10.0);
        height = rng.nextDouble(0.0, 10.0);
        this.containsAllergens = rng.nextBoolean();
        int flavorIndex = rng.nextInt(0, possibleFlavors.size());
        flavor = possibleFlavors.get(flavorIndex);
    }

    public CircularDessert(boolean containsAllergens)
    {
        this();
        this.containsAllergens = containsAllergens;
    }

    public double getVolume()
    {
        double radius = getDiameter() / 2;
        return PI * Math.pow(radius, 2) * getHeight();
    }

    @Override
    public String toString()
    {
        String allergenFlag = "";

        if (containsAllergens)
        {
            allergenFlag = "[CONTAINS ALLERGENS!!!] ";
        }
        return allergenFlag + flavor + " dessert has a diameter of " +
                diameter + " and a height of " + height;
    }

    public void setDiameter(double newDiameter)
    {
        if (newDiameter < 0)
        {
            diameter = 0;
        }
        else
        {
            diameter = newDiameter;
        }
    }

    public double getDiameter()
    {
        return diameter;
    }

    public String getFlavor()
    {
        return flavor;
    }

    public boolean setFlavor(String flavor)
    {
        if (!flavor.isEmpty())
        {
            this.flavor = flavor;
            return true;
        }
        return false;
    }

    public boolean isContainsAllergens()
    {
        return containsAllergens;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        if (height > 0)
        {
            this.height = height;
        }
    }

    public Random getRng()
    {
        return rng;
    }
}

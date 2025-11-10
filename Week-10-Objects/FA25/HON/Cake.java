public class Cake
{
    public double diameter = 0.0;
    private int numLayers = 0;
    private String flavor = "";
    private boolean containsAllergens = false;
    private final static double PI = 3.1415926;

    public Cake()
    {

    }

    public Cake(double diameter, int numLayers, String flavor, boolean containsAllergens)
    {
        // these bypass our setters and encapsulation
//        this.diameter = diameter;
//        this.numLayers = numLayers;
//        this.flavor = flavor;
        this.containsAllergens = containsAllergens;
        this.setDiameter(diameter);
        setNumLayers(numLayers);
        setFlavor(flavor);
    }

    public double getCakeVolume()
    {
        double radius = diameter / 2;
        return PI * Math.pow(radius, 2) * numLayers;
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

    public int getNumLayers()
    {
        return numLayers;
    }

    public void setNumLayers(int numLayers)
    {
        if (numLayers > 0)
        {
            this.numLayers = numLayers;
        }
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
}

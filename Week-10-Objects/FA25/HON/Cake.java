public class Cake
{
    private double diameter = 0.0;
    private int numLayers = 0;
    private String flavor = "";
    private boolean containsAllergens = false;

    public Cake()
    {

    }

    public Cake(double diameter, int numLayers, String flavor, boolean containsAllergens)
    {
        this.diameter = diameter;
        this.numLayers = numLayers;
        this.flavor = flavor;
        this.containsAllergens = containsAllergens;
    }

    public void setDiameter(double newDiameter)
    {
        if (newDiameter < 0)
        {
            diameter = 0;
        }
        else
        {
            this.diameter = newDiameter;
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

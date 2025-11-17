public class Cake extends CircularDessert
{
    private int numLayers = 0;

    public Cake()
    {
        super();
        numLayers = getRng().nextInt(0, 5);
    }

    public Cake(double diameter, double heightPerLayer, int numLayers, String flavor, boolean containsAllergens)
    {
        super(containsAllergens);
        setDiameter(diameter);
        setHeight(heightPerLayer);
        setFlavor(flavor);
        setNumLayers(numLayers);
    }

    @Override
    public double getVolume()
    {
        double radius = getDiameter() / 2;
        return PI * Math.pow(radius, 2) * (numLayers * getHeight());
    }

    @Override
    public String toString()
    {
        return super.toString() + " and " + numLayers + " layers";
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
}

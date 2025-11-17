import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Pie extends CircularDessert
{
    private String typeOfCrust = "";
    private boolean hasCrustTop = false;

    private ArrayList<String> possibleCrustTypes = new ArrayList<>(Arrays.asList("graham cracker", "chocolate", "regular"));

    public Pie()
    {
        int crustIndex = getRng().nextInt(possibleCrustTypes.size());
        setTypeOfCrust(possibleCrustTypes.get(crustIndex));
        setHasCrustTop(getRng().nextBoolean());
    }

    public Pie(double diameter, double height, String crustType, String fillingFlavor, boolean hasCrustTop, boolean containsAllergens)
    {
        super(containsAllergens);
        setDiameter(diameter);
        setHeight(height);
        setTypeOfCrust(crustType);
        setFlavor(fillingFlavor);
        setHasCrustTop(hasCrustTop);
    }

    @Override
    public String toString()
    {
        String allergenFlag = "";

        if (super.isContainsAllergens())
        {
            allergenFlag = "[CONTAINS ALLERGENS!!!] ";
        }
        return allergenFlag + super.getFlavor() + " pie with a " + typeOfCrust +
                " crust has a diameter of " + super.getDiameter() +
                " and a height of " + super.getHeight();
    }

    public String getTypeOfCrust()
    {
        return typeOfCrust;
    }

    public void setTypeOfCrust(String typeOfCrust)
    {
        this.typeOfCrust = typeOfCrust;
    }

    public boolean isHasCrustTop()
    {
        return hasCrustTop;
    }

    public void setHasCrustTop(boolean hasCrustTop)
    {
        this.hasCrustTop = hasCrustTop;
    }
}

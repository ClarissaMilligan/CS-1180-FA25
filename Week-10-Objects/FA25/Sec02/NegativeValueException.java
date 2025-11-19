public class NegativeValueException extends Exception // Exception is checked // RuntimeException // to make it unchecked
{
    public NegativeValueException()
    {
        super("The value cannot be negative!!!");
    }
}

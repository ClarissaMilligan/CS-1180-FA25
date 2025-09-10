public class IfStatementPractice
{
    public static void main(String[] args)
    {
        String student1 = new String("Bob");
        String student2 = new String("Bob");

        // if I am comparing two objects (like Strings)
        // I need to call the .equals() method
        if (student1.equals(student2))
        {
            System.out.println("These names are the same!");
        }
        else
        {
            System.out.println("These names are NOT the same!");
        }

        // for non-primitive types (like objects, like String)
        // the equality operator compares memory locations
        // NOT object information/variables
        // so this is not guaranteed to work the way we think
        if (student1 == student2)
        {
            System.out.println("These names are the same!");
        }
        else
        {
            System.out.println("These names are NOT the same!");
        }

        char cmd = 'o';
        switch (cmd) {
            case 'o':
                System.out.println("open");
                break;
            case 'c':
                System.out.println("close");
                break;
            default:
                System.out.println("bye");
                break;
        }

    }
}

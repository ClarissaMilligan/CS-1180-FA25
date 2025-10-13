import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class HONFileIO
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter("HON_Hello.txt");
        pw.println("Hello students!!!!!!");
        pw.close();
    }
}

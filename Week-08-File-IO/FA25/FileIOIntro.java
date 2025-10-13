import java.io.*;

public class FileIOIntro
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter("Hello.txt", true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Hello all students!!");
        pw.close();
        fw.close();
    }
}

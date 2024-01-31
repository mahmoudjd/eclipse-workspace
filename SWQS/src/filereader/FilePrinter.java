package filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilePrinter
{

    private String filename;

    private FileReader fr;

    private BufferedReader br;

    public FilePrinter(String filename)
    {
        // filename = this.filename;
        this.filename = filename;
    }

    public void print()
    {
        try
        {
            System.out.println("Trying to print the file...");
            fr = new FileReader(filename);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (Exception e)
        {
            System.out.println("Die Datei kann nicht gelesen werden.");

        }
    }
}

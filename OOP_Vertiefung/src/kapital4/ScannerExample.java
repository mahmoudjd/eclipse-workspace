package kapital4;

import java.util.Scanner;

public class ScannerExample
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.print(">");
            String line = input.nextLine();
            if (line.contains("fuck")|| line.contains("Fuck"))
            {
                System.out.println("Es enthält beleidigung, geh mal weg fuck you");
                break;
            }
            else
            {
                System.out.println("Eingabe war: " + line);
                if (line.equals("exit"))
                {
                    break;
                }

            }
        }
        input.close();

    }
}

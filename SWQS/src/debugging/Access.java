package debugging;

import java.util.Scanner;

public class Access
{

    public static void main(String[] args)
    {
        String admin = "Georg Rock";
        String username;

        Scanner in = new Scanner(System.in);

        System.out.print("First name: ");
        username = in.nextLine() + " ";
        System.out.println("\nLast name: ");
        username += in.nextLine();

        if (username == admin)    //== ist ein Referenzvergleich,( Beide Variablen beziehen sich auf dasselbe Objekt)  
        //if(username.equals(admin))  //.equals() wertet den Vergleich der Werte in den Objekten aus
        {
            System.out.println("Access granted!");
        }
        else
        {
            System.out.println("Access denied.");
        }

        in.close();
    }
}
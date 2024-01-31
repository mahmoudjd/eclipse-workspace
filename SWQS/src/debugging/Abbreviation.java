package debugging;

public class Abbreviation
{

    public static void main(String[] args)
    {

        String description = "Completely Automated Public Turing test to tell Computers and Humans Apart";
        String abbreviation = null;  //  "null"; "";

        // System.out.println(abbreviation);
        // System.out.println();
        String[] arr = description.split(" ");
        for (String word : arr)
        {
            char firstLetter = word.charAt(0);
            if (Character.isUpperCase(firstLetter))
            {
                abbreviation += firstLetter;
            }
        }

        System.out.println(abbreviation);
    }

}
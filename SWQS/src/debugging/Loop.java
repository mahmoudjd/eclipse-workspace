package debugging;

public class Loop
{

    public static void main(String[] args)
    {

        String s = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit.";
        String t = "Aenean commodo ligula eget dolor.";
        String u = "Aenean massa.";
        String v = "Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.";
        byte index; // -128 , 127 , Lösung type wechseln int oder long 

        String loremIpsum = s + t + u + v;
        char e = 'e';
        int count = 0;

        for (index = 0; index < loremIpsum.length(); index++)
        { // wenn index von type byte ist , dann wird die Schleife nicht abgebrochen
            char currentChar = loremIpsum.charAt(index); // bei -128 wir
                                                         // StringIndexOutOfBoundsException
                                                         // Ausgeworfen
            if (currentChar == e)
            {
                count += 1;
            }
        }

        System.out.println(count);
    }

}

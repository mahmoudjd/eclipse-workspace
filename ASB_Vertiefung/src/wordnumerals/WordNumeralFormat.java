package wordnumerals;

public class WordNumeralFormat
{
    public static String toString(int input)
    {
        String res = ""; // das letezte Ergebnis
        String zwErgebnis = ""; // speichert in der Schleife die Passende
                                // Ergebnisse
        String minus = ""; // prüft ob die Zahl negativ ist

        if (input == 0)
        {
            return "null";
        }

        // falls die Zahl negativ ist wechsele zu Pos und minus speichert

        if (input < 0)
        {
            input *= -1;
            minus = "-";
        }
        for (; input != 0; input /= 10)
        {
            int y = input % 10; // nimmt die ganz recht Ziffer
            switch (y)
            {
                case 0:
                    zwErgebnis = "null";
                    break;
                case 1:
                    zwErgebnis = "eins";
                    break;
                case 2:
                    zwErgebnis = "zwei";
                    break;
                case 3:
                    zwErgebnis = "drei";
                    break;
                case 4:
                    zwErgebnis = "vier";
                    break;
                case 5:
                    zwErgebnis = "fünf";
                    break;
                case 6:
                    zwErgebnis = "sechs";
                    break;
                case 7:
                    zwErgebnis = "sieben";
                    break;
                case 8:
                    zwErgebnis = "acht";
                    break;
                case 9:
                    zwErgebnis = "neun";
                    break;
                default:
                    throw new NumberFormatException();
            }

            if (res.equals(""))
            {
                res = zwErgebnis + res;
            }
            else
            {
                res = zwErgebnis + " " + res;
            }

        }

        /**
         * prüfen ob die Zahl negativ ist
         */
        if (minus.equals("-"))
        {
            res = minus + " " + res;
        }
        return res;

    }

    public static int parse(String s)
    {
        int result = 0; // das letzte Ergebnis

        int minus = 0; // diese Variable wird benutzt für dir negative eingabe

        String[] words = s.split(" ");

        int[] zwErgArray = new int[words.length]; // array um die
                                                // ZwischenErgebnisse zu
                                                // speichern

        for (int i = 0; i < words.length; i++)
        {
            /**
             * prüft die elemente von words Array und den passenden Ziffer in
             * zwergArr speichern
             */
            switch (words[i])
            {
                case "null":
                    zwErgArray[i] = 0;
                    break;
                case "eins":
                    zwErgArray[i] = 1;
                    break;
                case "zwei":
                    zwErgArray[i] = 2;
                    break;
                case "drei":
                    zwErgArray[i] = 3;
                    break;
                case "vier":
                    zwErgArray[i] = 4;
                    break;
                case "fünf":
                    zwErgArray[i] = 5;
                    break;
                case "sechs":
                    zwErgArray[i] = 6;
                    break;
                case "sieben":
                    zwErgArray[i] = 7;
                    break;
                case "acht":
                    zwErgArray[i] = 8;
                    break;
                case "neun":
                    zwErgArray[i] = 9;
                    break;
                case "-":
                    minus = -1;
                    break;
                default:
                    throw new NumberFormatException();
            }
            result = (result * 10) + zwErgArray[i];

        }
        int n = 0;

        /**
         * um die Zahlen den Interval von Int nicht zu überschreiten
         */
        for (int i = 0; i < zwErgArray.length; i++)
        {
            int test = (n * 10) + zwErgArray[i];

            if (((test ^ n) & (test ^ zwErgArray[i])) < 0)
            {
                throw new NumberFormatException("Die Zahl ist nicht Element von den ganzen Zahlen!");
            }

            n = (n * 10) + zwErgArray[i];

        }
        /**
         * prüfen ob die Zahl negativ ist
         */
        if (minus == -1)
        {
            return -result;
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(WordNumeralFormat.toString(0));
        System.out.println(WordNumeralFormat.toString(17));
        System.out.println(WordNumeralFormat.toString(5915211));
        System.out.println(WordNumeralFormat.toString(-59));

        System.out.println(WordNumeralFormat.parse("- vier acht sechs vier acht "));
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println(WordNumeralFormat.parse("zwei eins vier sieben vier acht drei sechs vier sieben "));

    }
}
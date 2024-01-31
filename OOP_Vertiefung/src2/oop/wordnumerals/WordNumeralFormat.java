package oop.wordnumerals;

public class WordNumeralFormat
{
    public static String toString(int value)
    {
        String result = "";
        int count = 1;
        int temp = 0;
        int sizeArray = 0;

        if (value < 0)
        {
            value = -value;
            result += "- ";
        }
        temp = value;
        while (temp >= 10)
        {
            sizeArray++;
            temp /= 10;
        }
        int[] arr = new int[++sizeArray];
        while (value >= 10)
        {
            arr[count - 1] = value % 10;
            value /= 10;
            count++;
        }
        arr[count - 1] = value % 10;
        for (int i = count - 1; i >= 0; i--)
        {
            switch (arr[i])
            {
                case 0:
                    result += "null ";
                    break;
                case 1:
                    result += "eins ";
                    break;
                case 2:
                    result += "zwei ";
                case 3:
                    result += "drei ";
                    break;
                case 4:
                    result += "vier ";
                    break;
                case 5:
                    result += "fünf ";
                    break;
                case 6:
                    result += "sechs ";
                    break;
                case 7:
                    result += "sieben ";
                    break;
                case 8:
                    result += "acht ";
                    break;
                case 9:
                    result += "neun ";
                    break;
                default:
                    System.out.println("Etwas mit dem Zahl ist schief gelaufen");
            }
        }
        result = result.substring(0, result.length() - 1);
        return result;
    }

    public static int parse(String str)
    {
        int res = 0;
        boolean test = false;
        String[] strSplit = str.split(" ");
        if (strSplit[0].equals("-"))
        {
            test = true;
        }

        for (int i = 0; i < strSplit.length; i++)
        {
            if (strSplit[i].equals("null"))
            {
                res = (res * 10) + 0;

            }
            else if (strSplit[i].equals("-"))
            {
                continue;

            }

            else if (strSplit[i].equals("eins"))
            {
                res = (res * 10) + 1;

            }
            else if (strSplit[i].equals("zwei"))
            {
                res = (res * 10) + 2;

            }
            else if (strSplit[i].equals("drei"))
            {
                res = (res * 10) + 3;

            }
            else if (strSplit[i].equals("vier"))
            {
                res = (res * 10) + 4;

            }
            else if (strSplit[i].equals("fünf"))
            {
                res = (res * 10) + 5;

            }
            else if (strSplit[i].equals("sechs"))
            {
                res = (res * 10) + 6;

            }
            else if (strSplit[i].equals("sieben"))
            {
                res = (res * 10) + 7;

            }
            else if (strSplit[i].equals("acht"))
            {
                res = (res * 10) + 8;

            }
            else if (strSplit[i].equals("neun"))
            {
                res = (res * 10) + 9;

            }
            else if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
            {
                throw new NumberFormatException();
            }
            else
            {
                throw new NumberFormatException();
            }

        }

        return test ? -res : res;

    }

    public static void main(String[] args)
    {

        System.out.println(parse("- null null eins zwei drei"));
        System.out.println(toString(123));

    }
}
package oop.version;

public class VersionNumber
{

    private static boolean lengthTest(String s)
    {
        if (s.length() <= 0)
        {
            return false;
        }
        return true;
    }

    private static boolean pointTest(String s)
    {
        if (s.charAt(0) == '.')
        {
            return false;
        }

        return true;
    }

    private static boolean negativNumbers(String s)
    {
        if (s.contains("-"))
        {
            return true;
        }
        return false;
    }

    public static int compare(String s1, String s2)
    {
        if (!lengthTest(s1) || !lengthTest(s2))
        {
            throw new NumberFormatException();
        }
        if (s1.equals(".") || s2.equals("."))
        {
            throw new NumberFormatException("ungültige String");
        }
        if(!pointTest(s1)|| !pointTest(s2))
        {
            throw new NumberFormatException("ungueltige Punkte");
        }
        if(negativNumbers(s1) || negativNumbers(s2))
        {
            throw new NumberFormatException("negative Zahl");
        }
        String[] numbers1 = s1.split("\\.");
        String[] numbers2 = s2.split("\\.");

        if (s1.length() <= s2.length())
        {

            for (int i = 0; i < numbers1.length; i++)
            {
                if (Integer.parseInt(numbers1[i]) > Integer.parseInt(numbers2[i]))
                {
                    return 1;
                }
                else if (Integer.parseInt(numbers1[i]) < Integer.parseInt(numbers2[i]))
                {
                    return -1;
                }
                
                
            }
            for(int rest = numbers1.length ; rest < numbers2.length ; rest++)
            {
                if(Integer.parseInt(numbers2[rest]) > 0)
                {
                    return -1;
                }
            }
        }
        if (s1.length() > s2.length())
        {
            for (int i = 0; i < numbers2.length; i++)
            {
                if (Integer.parseInt(numbers1[i]) > Integer.parseInt(numbers2[i]))
                {
                    return 1;
                }
                else if (Integer.parseInt(numbers1[i]) < Integer.parseInt(numbers2[i]))
                {
                    return -1;
                }

            }
            for(int rest = numbers2.length ; rest < numbers1.length ; rest++)
            {
                if(Integer.parseInt(numbers1[rest]) > 0)
                {
                    return 1;
                }
            }
            
        }
       

        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(compare("1.2.3.0.1", "1.2.3"));
    }
}

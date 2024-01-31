package eght;

import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<String> arrayString = new ArrayList<>();
        arrayString.add("Hello");

        for (String word : arrayString)
        {
            System.out.println(word);
        }

        GenericClass<String> stringContainer = new GenericClass<String>();
        stringContainer.setContent("hallo");
        String s = stringContainer.getContent();
        System.out.println(s);
        GenericClass<Integer> intContainer = new GenericClass<Integer>();
        intContainer.setContent(3);
        int i = intContainer.getContent();
        System.out.println(i);
    }
}

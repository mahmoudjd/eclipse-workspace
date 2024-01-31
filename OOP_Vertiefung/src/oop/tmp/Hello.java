package oop.tmp;

public class Hello
{
    public static void main(String[] args)
    {
        System.out.println("Hallo Welt");
        
        if(args.length ==1)
        {
            System.out.println("Es wurde ein Argument übergeben: "+ args[0]);
            
        }
        else
        {
            System.out.println("Es wurde "+args.length+" übergeben");
            
            for(int i = 0 ; i <args.length ; i++)
            {
                System.out.println((i+1)+". Argument: " +args[i]);
            }
            
        }
    }

}

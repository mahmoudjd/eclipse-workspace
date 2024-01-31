package eght;

//import java.util.*;

class AAA
{

}

class BBB extends AAA

{

}

public class CC
{
    // hier gibt es syntaktischen Fehler
    // public void m(ArrayList <AAA> list)
    // {
    //
    // }
    //
    // public void m(ArrayList<BBB> list)
    // {
    //
    // }
    @SuppressWarnings("unused")
    public static void main(String[] args) throws StackEmptyException
    {
        GenericStack <AAA> sa = new GenericStack<AAA>(10);
        GenericStack <? extends AAA> s = sa ;
        sa.push(new BBB() );
        AAA a = s.pop();
    }
}

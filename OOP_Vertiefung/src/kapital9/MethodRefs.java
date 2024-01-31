package kapital9;

interface OtherInterface
{

    void methode(OtherClass obj, int i, String string);

}

class OtherClass
{

    @SuppressWarnings("unused")
    private String s;

    public OtherClass(String string)
    {
        this.s = string;
    }

    public void otherOutPut(int i, String s2)
    {
        System.out.println( "( "+ i+", " + s2 +" )" );
    }

}

public class MethodRefs
{

    public static void useOtherInterface(OtherInterface other)
    {
        OtherClass obj = new OtherClass("hallo");
        other.methode(obj, 47, "elf");
    }

    public static void main(String[] args)
    {
        useOtherInterface((obj, i, s) -> obj.otherOutPut(i, s));
        
     

        useOtherInterface(OtherClass::otherOutPut);
    }
}

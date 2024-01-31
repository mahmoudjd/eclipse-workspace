package eght;

public class Exchange
{
    public <T> void exchange(GenericClass <T> o1 ,
                    GenericClass <T> o2)
    {
        T content1 = o1.getContent();
        T content2 = o2.getContent();
        o1.setContent(content2);
        o2.setContent(content1);
    }

    public static void main(String[] args)
    {
        GenericClass<String> hello = new GenericClass<String>();
        hello.setContent("hallo");
        GenericClass<String> world= new GenericClass<String>();
        world.setContent("Welt!");
        
        GenericClass<Integer> i1 = new GenericClass<Integer>();
        i1.setContent(111);
        GenericClass<Integer> i2= new GenericClass<Integer>();
        i2.setContent(222);
        
        Exchange e = new Exchange() ;
        e.exchange(hello, world);
        e.exchange(i1, i2);
        
        System.out.println(i1.getContent());
    }
}

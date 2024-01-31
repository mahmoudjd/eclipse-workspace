
package MyClass;

public class Main
{

    public static void main(String[] args)
    {
        // MyClass <Integer> obj1 = new MyClass <>(1);
        // MyClass <Double> obj2 = new MyClass <>(1.50);

        MyClass<Integer, Double> obj = new MyClass<>(10, 20.1);

        // obj1.showType() ;
        // obj2.showType() ;

        obj.showType();

        NumericFunc<Integer> num = new NumericFunc<>(5);

        System.out.println(num.square());

        NumericFunc<Integer> num1 = new NumericFunc<Integer>(5);
        NumericFunc<Double> num2 = new NumericFunc<Double>(-5.0);

        System.out.println(num1.absequals(num2));

    }

}

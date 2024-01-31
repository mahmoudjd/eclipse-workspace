package oop.proxy.caching;

import java.util.HashMap;
import java.util.Map;

public class Proxy implements FunctionInterface, ProxyAdminInterface
{

    private FunctionInterface functioninterface;

    private Map<Double, Double> xWerte;

    public Proxy(FunctionInterface functioniterface)
    {
        setFunci(functioniterface);
        xWerte = new HashMap<>();
    }

    public FunctionInterface getFunci()
    {
        return functioninterface;
    }

    public void setFunci(FunctionInterface functioniterface)
    {
        this.functioninterface = functioniterface;
    }

    @Override
    public void clearCache()
    {

        xWerte.clear();
    }

    private double helpF(double x)
    {
        double result = 0;

        if (xWerte.containsKey(x))
        {
            result = xWerte.get(x);
        }

        else
        {
            result = functioninterface.f(x);
            xWerte.put(x, result);
        }

        return result;
    }

    @Override
    public double f(double x)
    {
        return helpF(x);

    }

}

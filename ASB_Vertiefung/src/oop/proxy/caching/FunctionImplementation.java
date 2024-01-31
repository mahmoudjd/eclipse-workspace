package oop.proxy.caching;

import java.util.ArrayList;

public class FunctionImplementation implements FunctionInterface, FunctionAdminInterface
{
    private ArrayList<Double> coeffsH ;

    private boolean leer = false;

    public FunctionImplementation()
    {
        coeffsH = new ArrayList<Double>();
    }

    private boolean isLeer()
    {
        return leer;
    }

    private void setLeer(boolean leer)
    {
        this.leer = leer;
    }

    @Override
    public void setCoefficients(double[] coeffs)
    {
        if (coeffs == null || coeffs.length == 0)
        {
            setLeer(true);
        }

        for (int i = 0; i < coeffs.length; i++)
        {
            coeffsH.add(coeffs[i]);
        }

    }

    @Override
    public double[] getCoefficients()
    {
        if (coeffsH.size() == 0)
        {
            throw new IllegalArgumentException();
        }
        double[] newArray = new double[coeffsH.size()];
        for (int i = 0; i < newArray.length; i++)
        {
            newArray[i] = coeffsH.get(i);
        }
        return newArray;
    }

    @Override
    public double f(double x)
    {
        if (isLeer())
        {
            return 0;
        }
        double result = 0;
        int potenz = coeffsH.size() - 1;

        for (Double coeff : coeffsH)
        {
            double y = Math.pow(x, potenz);
            double res = coeff * y;
            result += res;
            potenz--;
        }

        return result;
    }

}

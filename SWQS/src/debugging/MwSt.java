package debugging;

public class MwSt
{

    public static void main(String[] args)
    {
        //  die Summe von Preisen der Produkte im Warenkorp zzg. MWst berechnen
        //
        

        // Netto-Preise im Warenkorb
        double[] shoppingCart = { 25.00, 20.00, 6.50, 50.00, 8.50 };
        double sum = 0, sumWithTax = 0;
        double taxPercentage = 19.0 / 100; // 19% Mehrwertsteuer (19.0/100.0)

        // Netto-Summe berechnen
        for (int i = 0; i < shoppingCart.length; i++)
        {
            sum += shoppingCart[i];
        }

        // Steuer berechnen
        double mwst = sum * taxPercentage;
        sumWithTax = sum + mwst ;
        System.out.println("Price including MwSt: " + sumWithTax);

    }
}

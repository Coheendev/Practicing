package util;

public class CurrencyConvert {

    public static final double IOF = 0.06;
     public static double dolarPrice;
     public static double bought;


     public static double convert  () {
         double tax = bought * dolarPrice * IOF;
         return bought * dolarPrice + tax;
     }
}

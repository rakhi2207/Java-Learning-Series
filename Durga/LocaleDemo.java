package Durga;
import java.text.*;
import java.util.*;
public class LocaleDemo {
    public static void main(String[] args) {
       double d=123456.785;
        Locale l=new Locale("en","IN");
        System.out.println(l.getDefault());
        System.out.println(l.getDisplayLanguage());
        NumberFormat nf=NumberFormat.getCurrencyInstance(l);
        System.out.println("India form is "+nf.format(d));

        nf=NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("US form is "+nf.format(d));

        nf=NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("UK form is "+nf.format(d));

        nf=NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China form is "+nf.format(d));

        nf=NumberFormat.getNumberInstance(Locale.UK);
        System.out.println("UK Number form is "+nf.format(d));

        nf=NumberFormat.getNumberInstance(l);
        System.out.println("India Number form is "+nf.format(d));
    }
}

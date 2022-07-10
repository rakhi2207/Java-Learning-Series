package CollegeDSA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Fuel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int petrol= scan.nextInt();
        int dis= scan.nextInt();
        if(petrol<=0)
        {
            System.out.println(petrol+" is an Invalid Input");
        }else if(dis<=0)
        {
            System.out.println(dis+" is an Invalid Input");
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        double val=(petrol*1.0/dis*1.0)*100;
        System.out.printf("Liters/100KM "+df.format(val)+"\n");
        double us=(dis*0.6214)/(petrol*0.2642);
        System.out.printf("Miles/gallons "+df.format(us)+"\n");
    }
}

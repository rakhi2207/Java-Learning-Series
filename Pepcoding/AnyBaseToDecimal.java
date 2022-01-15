package Pepcoding;

public class AnyBaseToDecimal {
    public static void main(String... args)
    {
        int val=25;
        int ans=0;
        int p=1;
        while(val>0)
        {
            int dig=val%2;
            val=val/2;
            System.out.println("dig "+dig+" p is "+p);
            ans+=dig*p;
            p=p*10;
        }
        System.out.println(ans);
    }
}

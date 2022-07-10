package Pepcoding;

public class DecimalToBinary {
    public static void main(String[] args) {
        long n=100;
        String s="";
        while(n>0)
        {
            s=n%2+s;
            n=n/2;
        }
        System.out.println(s);
    }
}

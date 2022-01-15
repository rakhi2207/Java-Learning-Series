package AJava;

import java.util.Scanner;

public class sec {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int days,hours,minutes,seconds;
        System.out.println("Enter the days hours minutes seconds");
        days= scan.nextInt();
        hours= scan.nextInt();
        minutes= scan.nextInt();
        seconds= scan.nextInt();

        int sec=(days*24*60*60)+(hours*60*60)+(minutes*60)+seconds;
        System.out.println("Seconds "+sec);
    }
}

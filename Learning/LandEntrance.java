package Learning;

import java.util.ArrayList;
import java.util.Scanner;

public class LandEntrance {

    public static long num_of_vowels(String s)
    {
        long cnt = 0;
        for(int i= 0 ; i<s.length() ; i++)
        {

            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A'     ||   s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U'  )
            {
                cnt++;
            }
        }

        return cnt;
    }

    public static void  convert_to_words(long num)
    {
        long n=num;
        long sum=0;
        int r;
        while(n>0)
        {

            r=(int)n%10;
            sum=sum*10+r;
            n=n/10;
        }
        n=sum;
        while(n>0)
        {
            r=(int)n%10;
            switch(r)
            {
                case 1:
                    System.out.print(" One");
                    break;
                case 2:
                    System.out.print(" Two");
                    break;
                case 3:
                    System.out.print(" Three");
                    break;
                case 4:
                    System.out.print(" Four");
                    break;
                case 5:
                    System.out.print(" Five");
                    break;
                case 6:
                    System.out.print(" Six");
                    break;
                case 7:
                    System.out.print(" Seven");
                    break;
                case 8:
                    System.out.print(" Eight");
                    break;
                case 9:
                    System.out.print(" Nine");
                    break;
                case 0:
                    System.out.print(" Zero");
                    break;

            }
            n=n/10;
        }
    }



    public static boolean isPrime(long num)
    {

        if (num <= 1)
            return false;

        for (long i = 2; i*i<=num; i++)
            if (num % i == 0)
                return false;

        return true;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long[] dig=new long[n];
        String[] str=new String[n];
        ArrayList<String> z=new ArrayList<>();
        for(int i=0 ; i< n;i++)
        {
            str[i]=scan.next();
        }

        for(int i=0 ; i< n;i++)
        {
            dig[i]=Character.getNumericValue(str[i].charAt(0));
            str[i]=str[i].substring(1);
        }
        for(int i=0 ; i< n ; i++)
        {
            z.add(scan.next());
        }
//
//        for(int i=0 ; i< n;i++)
//        {
//            System.out.println(dig[i]+" "+str[i]+" "+z.get(i));
//        }

        long totalans = 0;

        for(int i=0 ; i<n ; i++)
        {
            if( z.get(i).equals("Happy"))
            {
                totalans = totalans + dig[i] * 10;
            }

            if(z.get(i).equals("Sad"))
            {
                totalans = totalans + dig[i] * 5;

            }

            if(z.get(i).equals("Neutral"))
            {
                totalans = totalans + dig[i] * 2;
            }

            if(z.get(i)  == "None")
            {
                totalans = totalans + dig[i] ;
            }

        }
        long  totalans2 = 0;


        for(int i=0 ; i< n ; i++)
        {
            totalans2 = totalans2 + num_of_vowels(str[i]) * dig[i];

        }


        long  finalans = totalans/totalans2;



        if(isPrime(finalans))
        {
            System.out.print("Yes");
        }

        else{
            System.out.print("No");

        }


        convert_to_words(finalans);



    }
}

package Practice;
import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int count=0;
        int n=scan.nextInt();
        int[] arr=new int[n];
        int k= scan.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int len=(int)Math.pow(2,n);
        int i=0;

        int[] val=new int[n];

        while(i<len)
        {
            int value=i;
            int ind=0;
            int pos=n-1;
            while(value>0)
            {
                val[pos]=value%2;
                value=value/2;
                pos--;
            }
            int mul=1;
            for(int x:val)
            {
                if(x!=0)
                {
                    System.out.print("checks "+arr[ind]);
                    mul*=arr[ind];
                }
                ind++;
            }

            if(mul%10==k)
            {
                System.out.println("ch "+mul%10);
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println(count);
    }
}

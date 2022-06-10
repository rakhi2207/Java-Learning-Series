package Learning;

import java.util.Scanner;

public class Subset {
    public static void getS(int[] arr,int idx,String set,int x,int sos)
    {
        if(sos>x)
            return ;
        if(idx==arr.length)
        {
            if(sos==x)
                System.out.println(set);
            return ;
        }
        getS(arr,idx+1,set+arr[idx],x,sos+arr[idx]);
        getS(arr,idx+1,set,x,sos);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        int x= scan.nextInt();
        getS(arr,0,"",x,0);
    }
}

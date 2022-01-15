package Learning;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 values");
        for(int i=0;i<10;i++)
        {
            arr[i]=scan.nextInt();
        }

        int min=arr[0];
        for(int i=1;i<10;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }

        System.out.println("Minimum element is "+min);
    }
}

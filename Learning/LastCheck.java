package Learning;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LastCheck{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long r= scan.nextInt();
        scan.nextLine();
        String gets= scan.nextLine();
        String[] s=gets.split(",");
        int si=0,ei=-1;
        long count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                count++;
            }
        }
    }
}

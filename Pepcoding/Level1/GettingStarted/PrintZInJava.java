package Pepcoding.Level1.GettingStarted;
import java.util.*;
public class PrintZInJava {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        int count=3;
        for(int i=1;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(j==count)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
            count--;
        }

        for(int i=0;i<5;i++)
        {
            System.out.print("*");
        }
    }
}

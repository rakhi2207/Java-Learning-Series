package AJava;
import java.util.Scanner;
public class Salary {
        public static void main(String[] args)
        {
            double sal,bonus,sal1;
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter Salary:");
            sal=sc.nextDouble();
            if(sal>=7000)
            {
                bonus=1000+ (sal-7000)*0.02;
                System.out.print("Bonus is $"+bonus+" on Salary of$"+sal);
            }
            else
            {
                System.out.println("Min Sallary is $7000");
            }
        }
}

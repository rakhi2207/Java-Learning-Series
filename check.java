import java.util.Scanner;

public class check
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input;
        input= scan.nextInt();;
        for(int j=1;j<=input;j++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int j=1;j<=input;j++)
        {
            if(j==1||j==5)
            {
                System.out.print("*");
            }else
            {
                System.out.print("");
            }
        }
        System.out.println();
        for(int j=1;j<=input;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
}
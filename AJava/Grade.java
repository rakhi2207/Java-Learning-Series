package AJava;
import java.util.Scanner;

class Marks
{
    private float m1;
    private float m2;
    private float m3;
    private float m4;
    Marks(float m1,float m2,float m3,float m4)
    {
            this.m1=m1;
            this.m2=m2;
            this.m3=m3;
            this.m4=m4;
    }
    public float getAverage()
    {
        return (m1+m2+m3+m4)/4;
    }
}
public class Grade {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the no of students");
        int n=scan.nextInt();
        String[] fname=new String[n];
        String[] lname=new String[n];
        Marks[] m=new Marks[n];

        int best=-1;
        float score=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter first and last name of "+(i+1)+"student");
            fname[i]=scan.nextLine();
            lname[i]=scan.nextLine();
            System.out.println("Enter the marks of 4 subject ");
            float m1=scan.nextInt();
            float m2=scan.nextInt();
            float m3=scan.nextInt();
            float m4=scan.nextInt();
            Marks ms=new Marks(m1,m2,m3,m4);
            m[i]=ms;
            if(ms.getAverage()>score)
            {
                score=ms.getAverage();
                best=i;
            }
        }

        System.out.println("Best Student");
        System.out.println(fname[best]+" "+lname[best]);
        System.out.println("Average scored "+m[best].getAverage());
    }
}
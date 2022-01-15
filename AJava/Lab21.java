package AJava;
import java.util.Scanner;
public class Lab21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of students");
        int n=sc.nextInt();
        int r;
        student s[]=new student[n];
        for(int i=0;i<n;i++)
        {r=n+1;
            s[i]=new student(r);
            s[i].details();
        }
        for(int i=0;i<n;i++)
        {
            s[i].display();
        }
    }
}
class student
{
    int roll;
    String name;
    double p;
    public student(int r)
    {
        roll=r;
    }
    public void details()
    {System.out.println("Enter name&percentage of student");
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        p=sc.nextDouble();
    }
    public void display()
    {
        System.out.println("Name: "+name+" Rollno: "+roll+" Percentage:"+p);
    }
}

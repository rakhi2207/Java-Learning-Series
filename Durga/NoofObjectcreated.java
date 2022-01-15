package Durga;

public class NoofObjectcreated {

    static int count=0;
    {
        count++;
        System.out.println("4");
        System.out.println();
    }
    NoofObjectcreated()
    {
        System.out.println("1");
    }
    NoofObjectcreated(int i)
    {
        System.out.println("2");
    }
    NoofObjectcreated(double i)
    {
        System.out.println("3");
    }
    public static void main(String[] args) {
       NoofObjectcreated t=new NoofObjectcreated();
       NoofObjectcreated t1=new NoofObjectcreated(10);
       NoofObjectcreated t2=new NoofObjectcreated(10.5);
        System.out.println("No of Object "+count);
    }
    {
        System.out.println("Object Created");
        System.out.println("5");
    }
}

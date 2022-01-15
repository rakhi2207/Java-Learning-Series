package AJava;

class Ab
{
    public static void m1()
    {
        System.out.println("A");
    }
}

class Bb extends Ab
{

    public static void m1()
    {
        System.out.println("B");

    }
}
public class CompileRuntimePolymorphism {
    static public void main(String[] args) {
       Ab a=new Bb();
       a.m1();
    }
}

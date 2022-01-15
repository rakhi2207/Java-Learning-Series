package Learning_New_Concepts;
class A
{
    int i=10;
    {
        m1();
        System.out.println("Parent Instance Block");
    }
    A()
    {
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        A a=new A();
        System.out.println("Parent main");
    }
    public void m1()
    {
        System.out.println(j);
    }
    int j=20;
}

class B extends A
{
   int x=100;
    {
        m2();
        System.out.println("FIB");
    }
    B()
    {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        B b=new B();
        System.out.println("Child main");
    }
    public void m2()
    {
        System.out.println(y);
    }
    int y=100;
}
public strictfp class StrictFloatingPoint implements Cloneable {


}

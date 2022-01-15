package Durga;


class Base
{
    static int x=10;
    static
    {
        m2();
        System.out.println("First Base block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Base main method");
    }

    public static void m2()
    {
        System.out.println(j);
    }
    static int j=20;
}

class StaticFlowLearning extends Base
{
    static int x=10;
    static
    {
        m2();
        System.out.println("Derived First Base block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Derived main method");
    }

    public static void m2()
    {
        System.out.println(y);
    }
    static int y=20;
}

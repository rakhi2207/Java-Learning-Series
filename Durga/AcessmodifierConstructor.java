package Durga;

public class AcessmodifierConstructor {
    //Only public private protected can be used with constructor
    AcessmodifierConstructor()
    {

    }
    public static void main(String[] args) {
        final String c="h";
        System.out.println(c.hashCode());
        process(c);
        System.out.println(c);
    }

    static void process(String c)
    {
        c="x";
        System.out.println(c.hashCode());
    }
}

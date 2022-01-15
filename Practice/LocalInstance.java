package Practice;

public class LocalInstance {
    static int y;
    public static void m1()
    {
        int x=10;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args) {
       m1();
    }
}

package Learning_New_Concepts;

public class Check {
    public static void main(String[] args) {
        int a=25;
        //System.out.println(a>>3);
        System.out.println(a<<3);

        a=1;
        int b=2,c=3;
        a=a-- + --b;
        b=--a+b--;
        c=++a+--b+a--;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

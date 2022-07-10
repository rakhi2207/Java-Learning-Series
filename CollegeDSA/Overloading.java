package CollegeDSA;

public class Overloading {

    public static void main(String[] args) {
        System.out.println("String args");
        main(new int[]{1,2,3,4});
    }
    public static void main(int[] args)
    {
        System.out.println(args.length);
    }
}

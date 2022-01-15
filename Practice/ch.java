package Practice;


public class ch {
    public static void main(String[] args) {

        Integer i=0,a;
        Integer sum=0;
        a=(i*i*i);
        while(i<100)
        {
            sum=sum+a;
            i=i+1;
            a=(i*i*i);
            System.out.println("a is "+a);
        }

        System.out.println(sum);
    }
}

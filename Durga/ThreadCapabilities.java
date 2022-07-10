package Durga;

public class ThreadCapabilities extends Thread {
    public static int sum(int[] arr) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        int sum=0;
        for(int i:arr)
        {
            sum+=i;
        }
        return sum;
    }
    public static int multiply(int[] arr)
    {
        System.out.println(Thread.currentThread().getName());
        int product=0;
        for(int i:arr)
        {
            product*=i;
        }
        return product;
    }

    public void run()
    {
        multiply(new int[]{2,3,4,5,6});
    }
    public static void main(String[] args) throws InterruptedException {
        long start=System.nanoTime();
        ThreadCapabilities tc=new ThreadCapabilities();
        tc.setName("First");
        tc.start();
        sum(new int[]{2,3,4,5,6});
        // multiply(new int[]{2,3,4,5,6});
        long end=System.nanoTime();
        System.out.println("Time taken "+(end-start));
    }
}

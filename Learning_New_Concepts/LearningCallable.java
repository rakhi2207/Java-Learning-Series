package Learning_New_Concepts;

import java.io.IOException;
import java.util.concurrent.*;

class CloneThread implements Callable
{
    public Object call() throws InterruptedException
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("Child Thread");
        }

        return new String("Back to Parent");
    }
}
public class LearningCallable{
    public static void main(String[] args) throws Exception {
        CloneThread [] s={new CloneThread()};
        ExecutorService e= Executors.newFixedThreadPool(2);
        for(CloneThread c:s)
        {
            Future r=e.submit(c);
            System.out.println(r.get());
        }
        e.shutdown();
    }
}

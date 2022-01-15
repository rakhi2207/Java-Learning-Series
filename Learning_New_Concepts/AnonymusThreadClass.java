package Learning_New_Concepts;

public class AnonymusThreadClass {
    public static void main(String[] args) {
        Thread t=new Thread()
 {
          public void run()
          {
              for(int i=0;i<10;i++) {
                  System.out.println("Child Thread");
              }
          }
        };

        t.start();

        for(int i=0;i<10;i++)
        {
            System.out.println("main Thread");
        }
    }
}

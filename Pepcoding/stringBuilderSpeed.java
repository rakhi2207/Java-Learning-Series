package Pepcoding;

public class stringBuilderSpeed {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        StringBuilder  s=new StringBuilder("");
        for(int i=0;i<100000000;i++)
        {
            s.append(i);
        }

        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
}

package Durga;

public class forEachLoop_Twodimensional {
    public static void main(String[] args) {
        int[][] a={{10,20},{30,40}};
        for(int[] x:a)
        {
            for(int x1:x)
            {
                System.out.println(x1);
            }
        }
    }
}

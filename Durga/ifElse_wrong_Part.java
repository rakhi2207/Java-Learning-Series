package Durga;

public class ifElse_wrong_Part {
    public static void main(String[] args) {

        //Not allowed statement
//        if(true)
//            int x;

        if(true)
        {
            int x=10;
        }

        if(true)
            if(false){
                System.out.println("hello");}
        else
                System.out.println("Hii");
    }
}

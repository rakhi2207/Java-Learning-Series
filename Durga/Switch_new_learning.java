package Durga;

public class Switch_new_learning {
    public static void main(String[] args) {
//        byte b=10;
//        switch(b)
//        {
//            case 10:
//                System.out.println("10");
//                break;
//                case 100:
//                System.out.println("10");
//                break;
//                //compile time error required byte provided int
////                case 1000:
////                System.out.println("10");
////                break;
////                case 10000:
////                System.out.println("10");
////                break;
//        }

        //b+1 type becomes int so 1000 and 10000 will not give error
//        switch(b+1)
//        {
//            case 10:
//                System.out.println("10");
//                break;
//                case 100:
//                System.out.println("10");
//                break;
//                case 1000:
//                System.out.println("10");
//                break;
//                case 10000:
//                System.out.println("10");
//                break;
//        }

        int b=10;
        switch(b)
        {
            case 97:
                break;
                case 98:
                System.out.println("10");
                break;
                case 99:
                System.out.println("10");
                break;
                //Duplicate lable with case 97
//                case 'a':
//                System.out.println("10");
//                break;
        }
    }
}

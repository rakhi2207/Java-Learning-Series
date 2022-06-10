package Durga;

import CodeChef.Customer;

import java.util.Scanner;

public class classLoaderDemo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
//        System.out.println(StringRBuilder.class.getClassLoader());
//        System.out.println(classLoaderDemo.class.getClassLoader());
//        System.out.println(Customer.class.getClassLoader());
        String s="Hackerrank";
        String fs= scan.nextLine();
        String l=s+" "+fs;
        System.out.println(l);
    }
}

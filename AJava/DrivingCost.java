package AJava;
import java.util.Scanner;

public class DrivingCost {
        public static void main(String[] args) {
            double kmpd, cost, avg, parking, toll, total;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Total Kms driven per day:");
            kmpd = sc.nextDouble();
            System.out.println("Cost per L of fuel:");
            cost = sc.nextDouble();
            System.out.println("Average Km per L:");
            avg = sc.nextDouble();
            System.out.println("Parking fees per day:");
            parking = sc.nextDouble();
            System.out.println("Tolls per day:");
            toll = sc.nextDouble();
            total = parking + toll + (cost * (kmpd / avg));
            System.out.println("Total Cost of driving car is Rs." + total);
        }
}

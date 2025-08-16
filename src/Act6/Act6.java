package bank;

import java.util.Scanner;

public class Act6 {
        
        
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter distance (km): ");
    double distance = scanner.nextDouble();

    System.out.println("Travel class: ");
    System.out.println("1: Economy class: ");
    System.out.println("2: Business class: ");
    System.out.println("Class: ");
    int travelClass = scanner.nextInt();

    double baseFarePerKm = 0;

    if (travelClass == 1) {
        baseFarePerKm = 250;
    } else if (travelClass == 2) {
        baseFarePerKm = 500;
    } else {
        System.out.println("invalid class");
        scanner.close();
        return;
    }

    double totalFare = distance * baseFarePerKm;
    if (distance > 1000) {
        totalFare = totalFare * 0.9;
    }

    System.out.printf("Total fare: %.2f\n", totalFare);

    scanner.close();
}
}
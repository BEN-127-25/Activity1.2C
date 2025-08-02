

import java.util.Scanner;
public class Activity4 {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
       
        
        
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        
        System.out.print("Enter hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        
        System.out.print("Enter total hours worked this week: ");
        double hoursWorked = scanner.nextDouble();
        
        
        double grossWeeklyWage = hourlyRate * hoursWorked;
        double sssContribution = grossWeeklyWage * 0.10;
        double netWeeklyWage = grossWeeklyWage - sssContribution;
        
        
       
        System.out.println("\n--- Wage Summary ---");
        System.out.printf("Employee: %s\n", employeeName);
        System.out.printf("Hourly Rate: \u20B1%.2f\n", hourlyRate);
        System.out.printf("Hours Worked: %.0f\n", hoursWorked);
        System.out.printf("Gross Weekly Wage: \u20B1%.2f\n", grossWeeklyWage);
        System.out.printf("SSS Contribution (10%%): \u20B1%.2f\n", sssContribution);
        System.out.println("---");
        System.out.printf("Net Weekly Wage: PHP%.2f\n", netWeeklyWage);
        
        scanner.close();
    }
}

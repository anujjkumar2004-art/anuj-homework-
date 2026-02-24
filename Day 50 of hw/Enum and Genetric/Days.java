
package days;

import java.util.Scanner;

public class Days 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        String day;

        do {
            System.out.println("\n===== WEEKDAY WORKING SYSTEM =====");
            System.out.println("1. Check if day is Working Day");
            System.out.println("2. Check if day is Weekend");
            System.out.println("3. Display All Days");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Day: ");
                    day = sc.next().toUpperCase();

                    switch (day) {
                        case "MONDAY":
                        case "TUESDAY":
                        case "WEDNESDAY":
                        case "THURSDAY":
                        case "FRIDAY":
                            System.out.println(day + " is a Working Day");
                            break;

                        case "SATURDAY":
                        case "SUNDAY":
                            System.out.println(day + " is NOT a Working Day");
                            break;

                        default:
                            System.out.println("Invalid Day!");
                    }
                    break;

                case 2:
                    System.out.print("Enter Day: ");
                    day = sc.next().toUpperCase();

                    switch (day) {
                        case "SATURDAY":
                        case "SUNDAY":
                            System.out.println(day + " is Weekend");
                            break;

                        case "MONDAY":
                        case "TUESDAY":
                        case "WEDNESDAY":
                        case "THURSDAY":
                        case "FRIDAY":
                            System.out.println(day + " is NOT Weekend");
                            break;

                        default:
                            System.out.println("Invalid Day!");
                    }
                    break;

                case 3:
                    System.out.println("Days of the Week:");
                    for (WeekdayWorking  d : WeekdayWorking.Values()) 
                    {
                        System.out.println(d);
                    }
                    break;

                case 4:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 4);
    }
}


package laptopsystem;

import java.util.Scanner;

public class LaptopSystem  
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter RAM: ");
        String ram = sc.nextLine();

        
        System.out.print("Add SSD? (true/false): ");
        boolean ssd = sc.nextBoolean();

        System.out.print("Add Graphics Card? (true/false): ");
        boolean graphics = sc.nextBoolean();

        System.out.print("Add Extended Warranty? (true/false): ");
        boolean warranty = sc.nextBoolean();

        System.out.print("Add MS Office? (true/false): ");
        boolean office = sc.nextBoolean();

        Laptop laptop = new Laptop.LaptopBuilder(brand, ram)
        .setSSD(ssd)
        .setGraphicsCard(graphics)
        .setExtendedWarranty(warranty)
        .setMSOffice(office)
        .build();

        laptop.display();
    }
}

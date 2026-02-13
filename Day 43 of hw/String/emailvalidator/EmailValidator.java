package emailvalidator;
import java.util.Scanner;

public class EmailValidator 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email ID: ");
        String email = sc.nextLine();

        if (email.contains("@") && 
            email.contains(".") && 
            email.indexOf("@") < email.indexOf(".")) 
        {

            System.out.println("Valid Email");
        } 
        else 
        {
            System.out.println("Invalid Email");
        }
    }
}
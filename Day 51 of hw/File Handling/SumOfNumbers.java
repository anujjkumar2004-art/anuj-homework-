
package sumofnumbers;

import java.io.File;
import java.util.Scanner;

public class SumOfNumbers 
{
    public static void main(String[] args) throws Exception 
    {
        File fi = new File("c:\\ Numbers.txt");
        Scanner sc = new Scanner(fi);
        int sum = 0;
        while(sc.hasNextInt())
        {
            sum +=sc.nextInt();
        }
        sc.close();
        System.out.println("Sum =" + sum);
    }   
}

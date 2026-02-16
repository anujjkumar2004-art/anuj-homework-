
package college;

public class College 
{
    static final String CollegeName = "XYZ Engineering College";
    final double registrationFee;
    static int totalStudents  = 0;

    public College(double registrationFee) 
    {
        this.registrationFee = registrationFee;
        totalStudents++;
    }
        
    static void displayCollegeDetails()
    {
        System.out.println("College Name:" + CollegeName);
        System.out.println("Total Student:" + totalStudents);
    } 
    
    void displayStudentFee()
    {
        System.out.println("Student Registration Fee:" + registrationFee);
    }
    
    public static void main(String[] args) 
    {
        College clg1 =new College(25000);
        College clg2 =new College(30000);
        
        displayCollegeDetails();
        clg1.displayStudentFee();
        clg2.displayStudentFee();
    }
}

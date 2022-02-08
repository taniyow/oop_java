import java.util.*; 
public class Enrollment{
    public static void main(String args[]){
        
        EnrollmentClass result = new EnrollmentClass();
        output(result);
    }
    
    private static EnrollmentClass input(EnrollmentClass data)
    {
        String name;
        int year,code;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter name: ");
        name = input.next();
        data.setName(name);
        
        System.out.print("\nEnter Year Level: ");
        year = input.nextInt();
        data.setYear(year);
        
        System.out.print("\nEnter Course Code: ");
        code = input.nextInt();
        data.setCode(code);
        
        return data;
    }
    
     private static EnrollmentClass output(EnrollmentClass data)
    {
        input(data);
        System.out.println("\nYou are now enrolled " + data.getName());
        System.out.println("Course Code: " + data.getCode());
        System.out.println("Course Name: " + data.getCourse());
        System.out.println("Course Description: " + data.getDescription());
        System.out.println("Number of Units: " + data.getUnits());
        System.out.println("Tuition Fee: " + data.getFees());
        return data;
    }   

}
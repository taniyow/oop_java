import java.util.*; 
public class Array {
    public static void main(String args[]){
        ArrayClass result = new ArrayClass();
        output(result);
    }
    
    private static ArrayClass input(ArrayClass data)
    {
        String name,section;
        int numGrade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = input.next();
        data.setName(name);
     
        System.out.print("Enter Section: ");
        section = input.next();
        data.setSection(section);
        
        System.out.print("\nEnter Number of Grades: ");
        numGrade = input.nextInt();
        data.setNumGrade(numGrade);
        data.gradesArray();
        return data;
     }
    
    private static ArrayClass output(ArrayClass data)
    {
        input(data);
        System.out.println("\nYour name is: " + data.getName());
        System.out.println("Your section is: " + data.getSection());
        
        System.out.print("Grades: ");
        data.printGrades();
        
        return data;
    }   

}
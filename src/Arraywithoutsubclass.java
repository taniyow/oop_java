import java.util.*; 
public class Arraywithoutsubclass{
    public static void main(String args[]){
        
        String name,section;
        int numGrade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = input.next();
     
        System.out.print("Enter Section: ");
        section = input.next();
        
        
        System.out.print("\nEnter Number of Grades: ");
        numGrade= input.nextInt();
        int[] grades = new int[numGrade];
        for(int i=0; i<numGrade; i++){ //inputting of elements in array
            System.out.print("Grade " + (i+1) + ": ");
            grades[i] = input.nextInt();
        }
        System.out.println("\nYour name is: " + name);
        System.out.println("Your section is: " + section);
        
        printArray(grades);
    }   
    
    private static void printArray(int[] grades) {
        double sum = 0;
        double average;
        
        System.out.print("Grades: ");
        for(int i=0; i<grades.length; ++i){ //printing of elements in array 
            System.out.print(grades[i] + ",");
            sum = sum + grades[i];
        }
        
        average = sum/grades.length;
        System.out.println("\nAverage Grade: " + average);
    }

}
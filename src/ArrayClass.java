import java.util.Scanner;

class ArrayClass{
    private String name,section;
    private int numGrade;
    private int[] grades;
    
    public void setName(String word)
    {
        name = word;
    }
    public String getName()
    {
        return name;
    }
    
    public void setSection(String word)
    {
        section = word;
    }
    public String getSection()
    {
        return section;
    }
    
    public void setNumGrade(int num) {
        numGrade = num;
        grades = new int[num];
    }
    
    public int[] gradesArray()
    {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<numGrade; i++){ //inputting of elements in array
            System.out.print("Grade " + (i+1) + ": ");
            grades[i] = input.nextInt();
        }
       return grades;   
    }
    
    public void printGrades()
    {
        for(int i=0; i<grades.length; ++i){ //printing of elements in array 
            System.out.print(grades[i] + ",");
        }
    }
}
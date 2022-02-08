import java.util.Scanner;
public class Assessment {
    public static void main(String[] args){

        int subjCount;
        String subject;
        
        AssessmentData access = new AssessmentData(); 
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("# of Subjects: ");
        subjCount = input.nextInt();
        for(int i = 1; i <= subjCount; i++) {
            System.out.println("\nSubject # " + i);
            subject = input.next();
            
            System.out.print("Student #");
            access.setSubjects(subject);
            output(access);
        }
    }
    
    public static AssessmentData output(AssessmentData value){
        System.out.println("Subject: " + value.getSubjects());
        System.out.println("Number of Units: " + value.getUnits());
        System.out.println("Type: " + value.getType());
        return value;
    }
}

class AssessmentData
{
    private String subjects;
    private int units;
    private String type;
    
    public void setSubjects(String value){
        subjects = value;
    }
    
    public String getSubjects()
    {
        switch (subjects) {
            case "A":
            case "a":
                subjects = "OOPLANG";
                break;
            case "B":
            case "b":
                subjects = "CONWORLD";
                break;
            case "C":
            case "c":
                subjects = "ETHICS";
                break;
            case "D":
            case "d":
                subjects = "ETHICS";
                break;
            case "E":
            case "e":
                subjects = "OSAPP";
                break;
            case "F":
            case "f":
                subjects = "CALCULUS";
                break;
            case "G":
            case "g":
                subjects = "NATSCI";
                break;
            case "H":
            case "h":
                subjects = "DSALGO";
                break;
            default:
                break;
        }
        return subjects;
    }

    public int getUnits()
    {
        if (subjects.equals("A") || subjects.equals("a")) units = 5;
        else if (subjects.equals("B") || subjects.equals("b")) units = 3;
        else if (subjects.equals("C") || subjects.equals("c")) units = 3;
        else if (subjects.equals("D") || subjects.equals("d")) units = 4;
        else if (subjects.equals("E") || subjects.equals("e")) units = 2;
        else if (subjects.equals("F") || subjects.equals("f")) units = 3;
        else if (subjects.equals("G") || subjects.equals("g")) units = 3;
        else if (subjects.equals("H") || subjects.equals("h")) units = 6;
        return units;
    }

    public String getType()
    {
        if (subjects.equals("A") || subjects.equals("a")) type = "Lab";
        else if (subjects.equals("B") || subjects.equals("b")) type = "Lec";
        else if (subjects.equals("C") || subjects.equals("c")) type = "Lec";
        else if (subjects.equals("D") || subjects.equals("d")) type = "Lab";
        else if (subjects.equals("E") || subjects.equals("e")) type = "Lec";
        else if (subjects.equals("F") || subjects.equals("f")) type = "Lec";
        else if (subjects.equals("G") || subjects.equals("g")) type = "Lec";
        else if (subjects.equals("H") || subjects.equals("h")) type = "Lab";
        return type;
    }

}
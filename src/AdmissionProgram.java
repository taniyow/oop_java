package Midterms;
import java.util.*;

class AdmissionProgram {
    public static void main(String[] args) {
        AdmissionProgram value = new AdmissionProgram();
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            try {
                process(value);
            }
            catch(Exception e) {
                System.out.println("Invalid Input. Try Again.");
                process(value);
            }
            System.out.print("Try again? [Y/N]: ");
            answer = input.nextLine();
        } while(answer.equals("Y") || answer.equals("y"));
    }
    
    private static AdmissionStatus input(AdmissionStatus data)
    {
        String name,gender,status;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Gender: ");
        gender = input.nextLine();
        System.out.print("Status: ");
        status = input.nextLine();
        
        data.setName(name);
        data.setGender(gender);
        data.setStatus(status);
        return data;
    }
    
    private static AdmissionProgram process(AdmissionProgram data) 
    {
        AdmissionStatus value = new AdmissionStatus();
        Scanner input = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Number of Students: ");
        int count = input.nextInt();
        value.setCount(count);
        while(value.getCount() > num)
        {
            num++;
            System.out.println("\nStudent " + num);
            input(value);
            System.out.println("\nStudent:" + value.getName() + ", " + value.getGender());
            System.out.println("Status: " + value.getStatus());
        }
        return data;
    }
}

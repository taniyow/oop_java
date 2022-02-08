// Group2 - Katrine Dela Cruz
//          Angelo Dy-Reyes
//          Charles Albert Garcia
//          Jarell Galura
//          Mark Christian Tan 
package Midterms;
import java.util.*;
class ValidatePassword
{
    public static void main(String[] args)
    {
        ValidatePassword result = new ValidatePassword();
        
        System.out.println("Password requirements: ");
        System.out.println("\tMust have at least 2 uppercase letters.");
        System.out.println("\tMust have at least 2 lowercase letters.");
        System.out.println("\tMust have at least 2 digits.");
        
        output(result);
    }
    
    private static Password input(Password data)
    {
        String password;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nInput your Password: ");
        password = input.next();
        
        data.setPassword(password);
        return data;
    }
    
    private static ValidatePassword output(ValidatePassword data)
    {
        
        Password validation = new Password();
        
        Scanner input = new Scanner(System.in);
        String answer;
        
        do {
            input(validation);
            if(validation.getLower()<2) 
            {
                System.out.println("Password must have at least 2 lowercase letters.");
            }

            if(validation.getUpper()<2) 
            {
                System.out.println("Password must have at least 2 uppercase letters.");
            }

            if(validation.getDigits()<2) 
            {
                System.out.println("Password must have at least 2 digit numbers.");
            }
            if(validation.getUpper()>=2 && validation.getLower()>=2 && validation.getDigits()>=2)
            {
                System.out.println("Password Validation Successful!");
            }
            System.out.print("\nTry again? [Y/N]: ");
            answer = input.nextLine();
        } while(answer.equals("Y") || answer.equals("y"));

        return data;
    }
}

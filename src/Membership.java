import java.util.*;
public class Membership {
    public static void main(String[] args) {
        MembershipClass access = new MembershipClass();
        
        Scanner input = new Scanner(System.in);
        String answer;
        do {
            input(access);
            access.arrInput();
            access.output();
            System.out.print("\nDo you want to try again? [Y/N]: ");
            answer = input.next();
        } while(answer.equals("Y") || answer.equals("y")); 
    }
    
    private static MembershipClass input(MembershipClass access) {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Members: ");
        access.setCounter(input.nextInt());
        return access;
    }
}
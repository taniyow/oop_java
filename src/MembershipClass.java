import java.util.*;
class MembershipClass {
    private int counter;
    private String[] membershipCode, equivalent, member;
    private int[] membershipFee;
    
    public void setCounter(int num)
    {
        counter = num;
        member = new String [num];
        membershipCode = new String [num];
        equivalent = new String [num];
        membershipFee = new int [num];
    }
    
    public void arrInput()
    {
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<counter;++i){
            System.out.print("\nMember Name " + (i+1) + ": ");
            member[i]  = keyboard.next();
            System.out.print("Membership Code " + (i+1) + ": ");
            membershipCode[i]  = keyboard.next();
            
            equivalent(i);
            System.out.print("Equivalent: " + equivalent[i]);
            membershipFee(i);
            System.out.print("\nMembership Fee: " + membershipFee[i] + "\n");
        }
    }
    
    public String[] equivalent(int i)
    {
        if(membershipCode[i].equals("F")) equivalent[i] = "Female Member";
        else if(membershipCode[i].equals("M")) equivalent[i] = "Male Member";
        else if(membershipCode[i].equals("N")) equivalent[i] = "New Member";
        else if(membershipCode[i].equals("G")) equivalent[i] = "Guest Only";
        return equivalent;
    }
    
    public int[] membershipFee(int i)
    {
        if(membershipCode[i].equals("F")) membershipFee[i] = 200;
        else if(membershipCode[i].equals("M")) membershipFee[i] = 200;
        else if(membershipCode[i].equals("N")) membershipFee[i] = 350;
        else if(membershipCode[i].equals("G")) membershipFee[i] = 400;
        return membershipFee;
    }
    
    public void output()
    {
        System.out.println("\n----------- Registered Members -----------");
        for(int i=0; i<counter; ++i){
            System.out.println("Member Name " + (i+1) + ": " + member[i]);
            System.out.println("Equivalent: " + equivalent[i]);
            System.out.println("Membership Fee: " + membershipFee[i] + "\n");
        }
    }
}
import java.util.*;
public class MembershipRegClass {
    private int num;
    private String[] name, equivalent;
    private char[] code;
    private float[] fee;
    
    public void setNum(int n)
    {
        num = n;
        name = new String[n];
        code = new char[n];
        equivalent = new String[n];
        fee = new float[n];
    }
    
    public int getNum()
    {
        return num;
    }
    
    public void arr()
    {
        Scanner key = new Scanner(System.in);
        for(int i=0 ; i<num ; i++)
        {
            System.out.print("\nName: ");
            name[i] = key.next();
            System.out.print("Code: ");
            code[i] = key.next().charAt(0);
            
            equivalent(i);
            System.out.print("Equivalent: " + equivalent[i]);
            fee(i);
            System.out.print("\nMembership Fee: " + fee[i] + "\n");
        }
    }
    
    public String[] getName()
    {
        return name;
    }
    
    public String[] equivalent(int i)
    {
        switch (code[i]) {
            case 'F':
            case 'f':
                equivalent[i] = "Female Member";
                break;
            case 'M':
            case 'm':
                equivalent[i] = "Male Member";
                break;
            case 'N':
            case 'n':
                equivalent[i] = "New Member";
                break;
            case 'G':
            case 'g':
                equivalent[i] = "Guest Only";
                break;
            default:
                break;
        }
        return equivalent;
    }
    
    public float[] fee(int i)
    {
        switch (code[i]) {
            case 'F':
            case 'f':
                fee[i] = 200;
                break;
            case 'M':
            case 'm':
                fee[i] = 200;
                break;
            case 'N':
            case 'n':
                fee[i] = 350;
                break;
            case 'G':
            case 'g':
                fee[i] = 400;
                break;
            default:
                break;
        }
        return fee;
    }
}


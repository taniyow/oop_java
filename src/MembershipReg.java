import java.util.Scanner;
public class MembershipReg {
    public static void main(String args[]) {
        MembershipRegClass data = new MembershipRegClass();
        
        Scanner key = new Scanner(System.in);
        System.out.print("No. of Members: ");
        data.setNum(key.nextInt());
        data.arr();
        output(data);
    }
    
    public static MembershipRegClass output(MembershipRegClass data) {
        System.out.println("\n\nRegistered Members\n*****************");
        for(int i=0; i<data.getNum(); i++){
            System.out.println("Name: " + data.getName()[i]);
            String[] equiv = data.equivalent(i);
            System.out.println("Equivalent: " + equiv[i]);
            float[] mfee = data.fee(i);
            System.out.println("Membership Fee: " + mfee[i] + "\n");
        }
        return data;
    }
}
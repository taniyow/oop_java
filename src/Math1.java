import java.util.Scanner;
import java.lang.Math;

public class Math1{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Math2 result = new Math2();
        int a;
        int b;
        double numerator, denominator, eq2, eq1, ans;


        System.out.print("Enter value for a: ");
        a = sc.nextInt();
        System.out.print("Enter value for b: ");
        b = sc.nextInt();

        result.setA(a);
        result.setB(b);

        numerator = (Math.pow(result.getA(),2)*(result.getA()*result.getB()/2))+(Math.pow(result.getA(),3));
        denominator = result.getA()+result.getB()-2;
        eq2 = 3*(Math.pow(result.getA(),2)*Math.pow(result.getB(),3));
        eq1 = numerator/denominator;
        ans = eq1 * eq2;

        System.out.print("Answer: " + ans);
    }
}

class Math2{
    private int a;
    private int b;
    
    public void setA(int num)
    {
        a = num;
    }
    
    public int getA()
    {
        return a;
    }
    
    public void setB(int num)
    {
        b = num;
    }
    
    public int getB()
    {
        return b;
    }
}

import java.util.Scanner;
public class Values{
    
    public static void main(String args[])
    { 
        ValuesClass access = new ValuesClass();
        process(access);
        System.out.println("End of Loop!");
    }

    private static ValuesClass input(ValuesClass inputs)
    {
        int base,loop; 
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Value: ");
        base = input.nextInt();
        System.out.print("Loop Timer: ");
        loop = input.nextInt();

        inputs.setBaseValue(base);
        inputs.setLoop(loop);
        return inputs; 
    }

    private static ValuesClass process(ValuesClass value)
    {
        input(value);
        int numBase, num, latest;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a Value: ");
        numBase = input.nextInt();
        if(value.getBaseValue()% 2 == 0){
                latest = value.getBaseValue()-numBase;
                value.setValue(latest);
            }
        else {
            latest = value.getBaseValue()+numBase;
            value.setValue(latest);
        }
        
        System.out.println("Latest Value: " + value.getValue() + "\n");
        
        for(int i=0;i<value.getLoop()-1;++i){
            System.out.print("Enter a Value: ");
            num = input.nextInt();
            if(num % 2 == 0){
                latest = value.getValue()-num;
                value.setValue(latest);
            }
            else {
                latest = value.getValue()+num;
                value.setValue(latest);
            }
            System.out.println("Latest Value: " + value.getValue() + "\n");
        }
        return value;
    }
    
}
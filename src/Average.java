import java.util.*;
class Average{
    public static void main(String args[]){
        
        AverageClass access = new AverageClass();
        
        input(access);
        process(access);
        output(access);
    }
    
    private static AverageClass input(AverageClass data)
    {
        int fnum,snum,tnum;
        
        Scanner input = new Scanner(System.in);
        System.out.print("\nInput the first number: ");
        fnum = input.nextInt();
        data.setFnum(fnum);
        System.out.print("\nInput the second number: ");
        snum = input.nextInt();
        data.setSnum(snum);
        System.out.print("\nInput the third number: ");
        tnum = input.nextInt();
        data.setTnum(tnum);
        
        return data;
    }
    private static AverageClass process(AverageClass data)
    {
        System.out.println("\nThe Max value is: " + data.getMax());
        System.out.println("The Min value is: " + data.getMin());
        return data;
    }
    private static AverageClass output(AverageClass data)
    {
        System.out.println("The Average value is: " + data.getAverage());
        return data;
    }
}
import java.util.*;

public class DivisionMethodPassing {
   public static void main(String[] args) {
       double numerator, divisor, divide;
       numerator = numerator();
       divisor = divisor();
       divide = process(numerator, divisor);
       display(divide);
   }
   
   public static double numerator() { // input
       double numerator;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter numerator: ");
       numerator = input.nextInt();
       return numerator;

   }
    public static double divisor() { // input
       double divisor;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter divisor: ");
       divisor = input.nextInt();
       return divisor;
       
   }
   
   public static double process(double numerator, double divisor) { // process
       double divide_number;
       divide_number = numerator / divisor;
       return divide_number;
   }

    private static void display(double divide) { //output
        System.out.println("The quotient is " + divide);
    }
}
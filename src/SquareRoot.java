import java.lang.Math;
import java.util.Scanner;

public class SquareRoot {
   public static void main(String[] args) {
       double number, sq;
       number = method_Number();
       sq = process(number);
       display(sq);
   }
   
   public static double method_Number() { // input
       double num_input;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter number to square: ");
       num_input = input.nextInt();
       
       return num_input;
   }
   
   public static double process(double num_input) { // process
       double sq_num;
       sq_num = Math.sqrt(num_input);
       return sq_num;
   }

    private static void display(double sq) { //output
        System.out.println("Square root of the number is "+ sq);
    }
}
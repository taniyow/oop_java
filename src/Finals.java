import java.util.Scanner;
public class Finals {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Finals2 invoke = new Finals2();
        
        System.out.print("Enter number of games: ");
        int x = input.nextInt();
        System.out.print("Enter number of gamers: ");
        int y = input.nextInt();
        invoke.numberofinputs(x, y);
        invoke.entergame();
        invoke.finaloutput();
    }
}
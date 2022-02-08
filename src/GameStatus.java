import java.util.*;
class GameStatus {
    public static void main(String[] args) {
        GameStatusClass access = new GameStatusClass();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Number of Gamers: ");
        access.setnumGamers(input.nextInt());
        access.arrInput();
        access.output();
    }
}
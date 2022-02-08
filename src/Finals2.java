import java.util.ArrayList;
import java.util.Scanner;
public class Finals2 {
    private final ArrayList<String> Games;
    private final ArrayList<String> Gamers;
    private final ArrayList<String> Status;
    private final ArrayList<Integer> Score;
    
    int numgames,numgamers,score;
    public Finals2() {
        this.Games = new ArrayList<>();
        this.Gamers = new ArrayList<>();
        this.Status = new ArrayList<>();
        this.Score = new ArrayList<>();
        numgames=0;
        numgamers=0;
    }
    public void numberofinputs(int x, int y) {
        numgames=x;
        numgamers=y;
    }
    
    public void entergame() {
        Scanner input = new Scanner(System.in);
        for(int n=0; n<numgames; ++n){
            System.out.print("Enter the Game#" + (n+1) + ": ");
            String game = input.next();
            Games.add(game);
            entergamers();
        }
    }
    
    public void entergamers() {
        Scanner input = new Scanner(System.in);
        for(int y=0; y<numgamers; ++y){
            System.out.print("Gamer" + (y+1) + " : ");
            String gamer = input.next();
            Gamers.add(gamer);
            enterscore();
            enterstatus();
        }
    }
    
    public void enterscore() {
        Scanner input = new Scanner(System.in);
        System.out.print("Score: ");
        score = input.nextInt();
        Score.add(score);
    }
    
    public void enterstatus() {
        if(score>=1 && score<=50) Status.add("Noob");
        else if(score>=51 && score<=100) Status.add("Savage");
        else if(score>=101 && score<=150) Status.add("Expert");
        else if(score>=151 && score<=200) Status.add("Master");
        else if(score>=201 && score<=250) Status.add("Veteran");
        else if(score>=251 && score<=300) Status.add("Legendary");
        else if(score>300) Status.add("Mythical");
    }
    
    public void printgames(int n){
        System.out.println("\nGame#"+ (n+1) + ": " + Games.get(n));
    }
    
    public void finaloutput() {
        int y=0;
        for(int x=0; x<Games.size(); ++x){
            printgames(x);
            System.out.println("\nGamer\t\t\tScore\t\t\tStatus");
        for(; y<(Gamers.size()/numgames)*(x+1); ++y){
            System.out.println(((y+1)/(x+1)) + "-" + Gamers.get(y) + "\t\t\t" + Score.get(y) + "\t\t\t" + Status.get(y));
        }
        }
    }
}
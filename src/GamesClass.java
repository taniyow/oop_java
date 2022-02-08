import java.util.*;
class GamesClass {
    private int ngames,ngamers;
    private String[] games;
    
    public void nloops()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of games: ");
        ngames = in.nextInt();
        System.out.print("Enter number of gamers each game: ");
        ngamers = in.nextInt();
        games = new String[ngames];
    }
    
    public String[] inputgames()
    {
        Scanner in = new Scanner(System.in);
        for(int i=0 ; i<ngames ; ++i)
        {
            System.out.print("Enter Game: ");
            games[i] = in.next();
        }
        return games;
    }
    
    public List[][] createlist()
    {
        nloops();
        inputgames();
        List[][] list = new List[ngames*ngamers][3];
        Scanner in = new Scanner(System.in);
        int score, n, i=0;
        for(n=0 ; n<ngames ; ++n)
        {
            System.out.println("\nGame#" + (n+1) + " " + games[n]);
            for(; i<(list.length/ngames)*(n+1) ; ++i)
            {
                list[i][0] = new List();
                System.out.print("Gamer " + (i-n*ngamers+1) + ": ");
                list[i][0].setGamers(in.next());
                System.out.print("Score: ");
                score = in.nextInt();
                list[i][0].setScores(score);
                if(score>=1 && score<=50) list[i][0].setStatus("Noob");
                else if(score>=51 && score<=100) list[i][0].setStatus("Savage");
                else if(score>=101 && score<=150) list[i][0].setStatus("Expert");
                else if(score>=151 && score<=200) list[i][0].setStatus("Master");
                else if(score>=201 && score<=250) list[i][0].setStatus("Veteran");
                else if(score>=251 && score<=300) list[i][0].setStatus("Legendary");
            }
        }
        return list;
    }
    
    public void print(List[][] value)
    {
        int n, i=0;
        for(n=0 ; n<ngames ; ++n)
        {
            System.out.println("\nGame#" + (n+1) + " " + games[n]);
            System.out.println("\nGamer\t\tScore\t\tStatus");
            for( ;i<(value.length/ngames)*(n+1) ; ++i)
            {
                System.out.println((i-n*ngamers+1) + " " + value[i][0].getGamers() + "\t\t" + value[i][0].getScores() + "\t\t" + value[i][0].getStatus());
            }
        }
    }
}
import java.util.*;
public class GamArrProcess {
    
    //enums
    public enum Status { Noob, Savage, Expert, Master, 
                        Veteran, Legendary, Mythical }
    
    private int ngames, ngamers;
    private String[] games;
    
    Scanner in = new Scanner(System.in);
    
    //counter method
    public void counter()
    {
        System.out.print("Enter no. of games: ");
        ngames = in.nextInt();
        System.out.print("Enter no. of gamers: ");
        ngamers = in.nextInt();
        games = new String[ngames];
    }
    
    //games input
    public String[] games()
    {
        for(int i=0; i<ngames; ++i)
        {
            System.out.print("Game" + (i+1) + " : ");
            games[i] = in.next();
        }
        return games;
    }
    
    //arrayclass instance method
    public GamArr[][] input()
    {
        counter();
        games();
        //instance of class as array
        GamArr[][] list = new GamArr[ngames*ngamers][3];
        int j=0, i, score;
        for(i=0; i<ngames; ++i)
        {
            System.out.println("\nGame#" + (i+1) + " " + games[i]);
            for(; j<(list.length/ngames)*(i+1); ++j)
            {
                list[j][0] = new GamArr();
                System.out.print("Gamer " + (j-i*ngames+1) + " : ");
                list[j][0].setUser(in.next());
                System.out.print("Score: ");
                score = in.nextInt();
                list[j][0].setScore(score);
                
                //evaluate score and access enums converted toString
                if(score>=1 && score<=50) 
                    list[j][0].setStatus(Status.Noob.toString());
                else if(score>=51 && score<=100) 
                    list[j][0].setStatus(Status.Savage.toString());
                else if(score>=101 && score<=150) 
                    list[j][0].setStatus(Status.Expert.toString());
                else if(score>=151 && score<=200) 
                    list[j][0].setStatus(Status.Master.toString());
                else if(score>=201 && score<=250) 
                    list[j][0].setStatus(Status.Veteran.toString());
                else if(score>=251 && score<=300) 
                    list[j][0].setStatus(Status.Legendary.toString());
                else 
                    list[j][0].setStatus(Status.Mythical.toString());
            }
        }
        return list;
    }
    
    //output method
    public void output(GamArr[][] data)
    {
        int i,j=0;
        for(i=0; i<ngames; ++i)
        {
            System.out.println("\nGame#" + (i+1) + " " + games[i]);
            System.out.println("Gamer\t\tScore\t\tStatus");
            for( ; j<(data.length/ngames)*(i+1); ++j)
            {
                System.out.println((j-i*ngames+1) + " " 
                        + data[j][0].getUser() + "\t\t" 
                        + data[j][0].getScore() + "\t\t" 
                        + data[j][0].getStatus());
            }
        }
    }
}

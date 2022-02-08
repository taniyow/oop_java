import java.util.*;
class GameStatusClass {
    private int numGamers;
    private String[] username,gameStatus;
    private int[] gameScore;

    public void setnumGamers(int num)
    {
        numGamers = num;
        username = new String [num];
        gameScore = new int [num];
        gameStatus = new String [num];
    }
    public void arrInput()
    {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<numGamers;++i){
            System.out.print("Username " + (i+1) + ": ");
            username[i]  = input.next();
            System.out.print("Game Score: ");
            gameScore[i] = input.nextInt();
        }
    }
    public void setStatus()
    {
        for(int i=0; i<numGamers; ++i){
            if(gameScore[i]>=1 && gameScore[i]<=50) gameStatus[i] = "Noob";
            else if(gameScore[i]>=51 && gameScore[i]<=100) gameStatus[i] = "Savage";
            else if(gameScore[i]>=101 && gameScore[i]<=150) gameStatus[i] = "Expert";
            else if(gameScore[i]>=151 && gameScore[i]<=200) gameStatus[i] = "Master";
            else if(gameScore[i]>=201 && gameScore[i]<=250) gameStatus[i] = "Veteran";
            else if(gameScore[i]>=251 && gameScore[i]<=300) gameStatus[i] = "Legendary";
            else if(gameScore[i]>300) gameStatus[i] = "Mythical";
        }
    }
    public void output()
    {
        setStatus();
        System.out.println("\n----------- Gamers Status -----------");
        for(int i=0; i<numGamers; ++i){
            System.out.println("Gamer " + (i+1) + ": " + username[i]);
            System.out.println("Game Score: " + gameScore[i]);
            System.out.println("Game Status: " + gameStatus[i] + "\n");
        }
    }
}
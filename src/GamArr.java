public class GamArr {
    private String user, status;
    private int score;
    
    // main method
    public static void main(String[] args)
    {
        GamArrProcess data = new GamArrProcess();
        GamArr arr[][] = data.input();
        data.output(arr);
    }
    
    //constructor
    public GamArr()
    {
        user = "";
        status = "";
        score = 0;
    }
    //create array objects
    public GamArr(String username, String gamestatus, int gamescore)
    {
        user = username;
        status = gamestatus;
        score = gamescore;
    }

    public void setUser(String username)
    {
        user = username;
    }
    public String getUser()
    {
        return user;
    }
    
    public void setScore(int gamescore)
    {
        score = gamescore;
    }
    public int getScore()
    {
        return score;
    }
    
    public void setStatus(String gamestatus)
    {
        status = gamestatus;
    }
    public String getStatus()
    {
        return status;
    }
}

public class Games {
    public static void main(String args[]) {
        GamesClass data = new GamesClass();
        List output[][] = data.createlist();
        data.print(output);
    }
}

class List {
    private String Gamers, Status;
    private int Score;
    
    public List()
    {
        Gamers = "";
        Score = 0;
        Status = "";
    }
    
    public List(String name, int score, String status)
    {
        Gamers = name;
        Score = score;
        Status = status;
    }
    
    public void setGamers(String name)
    {
        Gamers = name;
    }
    public String getGamers()
    {
        return Gamers;
    }
    
    public void setScores(int score)
    {
        Score = score;
    }
    public int getScores()
    {
        return Score;
    }
    
    public void setStatus(String status)
    {
        Status = status;
    }
    public String getStatus()
    {
        return Status;
    }
}
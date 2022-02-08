class GradeClass {
    private String answer;
    private int score;
    private double rate;
    private String equivalent;
    
    public void setAnswer(String ans)
    {
        answer = ans;
    }

    public String getAnswer()
    {
        return answer;
    }
    
    public void setScore(int num)
    {
        score = num;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public double getRate()
    {
        if(100>=score && score>=97) rate = 1.00;
        else if(96>=score && score>=94) rate = 1.25;
        else if(93>=score && score>=91) rate = 1.50;
        else if(90>=score && score>=88) rate = 1.75;
        else if(87>=score && score>=85) rate = 2.00;
        else if(84>=score && score>=82) rate = 2.25;
        else if(81>=score && score>=79) rate = 2.50;
        else if(78>=score && score>=76) rate = 2.75;
        else if(score == 75) rate = 3;
        else rate = 5;
        return rate;
    }
    
    public String getEquivalent()
    {
        if(100>=score && score>=90) equivalent = "A";
        else if(89>=score && score>=80) equivalent = "B";
        else if(79>=score && score>=75) equivalent = "C";
        else equivalent = "E";
        return equivalent;
    }
}

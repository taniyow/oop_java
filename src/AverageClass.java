   class AverageClass{
    private int fnum,snum,tnum,max,min;
    private double average;
    
    public void setFnum(int num)
    {
        fnum = num;
    }
    
    public void setSnum(int num)
    {
        snum = num;
    }
    
    public void setTnum(int num)
    {
        tnum = num;
    }
    
    public int getMax()
    {
       int max = fnum;
        if (snum > max) {
            max = snum;
        }
 
        if (tnum > max) {
            max = tnum;
        }
 
        return max;
    }
    
    public int getMin()
    {
       int min = fnum;
        if (snum < min) {
            min = snum;
        }
 
        if (tnum < min) {
            min = tnum;
        }
 
        return min;
    }
    
    public double getAverage()
    {
       average = (fnum + snum+ tnum) / 3;
       return average;
    }
}
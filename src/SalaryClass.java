public class SalaryClass {
    private int salary;
    private double bonus;
    private String CLevel;
    
    public void setSalary(int num)
    {
        salary = num;
    }
    public int getSalary()
    {
        return salary;
    }
    
    public String getCLevel()
    {
        if(10000>=salary && salary>=1) {
            CLevel = "1";
        }
        else if(10001<=salary && salary<=50000){
            CLevel = "2";
        }
        else {
            CLevel = "3";
        }
        return CLevel;
    }
    
    public double getBonus()
    {
        double range1 = .5, range2 = 1, range3 = 2;
        if(10000>=salary && salary>=1) {
            bonus = range1;
        }
        else if(10001<=salary && salary<=50000){
            bonus = range2;
        }
        else {
            bonus = range3;
        }
        return bonus;
    }
}

class SalaryGradeClass{
    private String name;
    private int hours, grade;
    private double bonus, salary;
    
     public void setName(String word)
    {
        name = word;
    }
    public String getName()
    {
        return name;
    }
    
    public void setGrade(int num)
    {
        grade = num;
    }
    public int getGrade()
    {
        return grade;
    }
    
    public void setHours(int num)
    {
        hours = num;
    }
    public int getHours()
    {   
        return hours;
    }

    public double getBonus()
    {
        if(hours>40){
            if(grade == 1){
                bonus = 0.05;
            }
            else if(grade == 2){
                bonus = 0.10;
            }
            else if(grade == 3){
                bonus = 0.15;
            }
        }
        else {
            bonus = 0;
        }
        return bonus;
    }
    
    public double getSalary()
    {
        if(grade == 1){
            salary = 50;
        }
        else if (grade == 2){
            salary = 70;
        }
        else if (grade == 3){
            salary = 100;
        }
        return salary;
    }
}
class EnrollmentClass{
    private String name,course,description;
    private int year,code,units,fees;
   
    public void setName(String word)
    {
        name = word;
    }
    public String getName()
    {
        return name;
    }
    
    public void setYear(int num)
    {
        year = num;
    }
    public int getYear()
    {
       return year;   
    }
    public void setCode(int num)
    {
        code = num;
    }
    public int getCode()
    {
       return code;   
    }
    public String getCourse()
    {
        switch (code){
            case 2087:
                course = "CALCULUS";
                break;
            case 2089:
                course = "DSALGO";
                break;
            case 2088:
                course = "PROBSTAT";
                break;
            case 2090:
                course = "OOPLANG";
                break;
            default:
                break;
        }
        return course;
    }
    public String getDescription()
    {
        switch (code){
            case 2087:
                description = "LEC";
                break;
            case 2089:
                description = "LAB";
                break;
            case 2088:
                description = "LEC";
                break;
            case 2090:
                description = "LAB";
                break;
            default:
                break;
        }
        return description;
    }
    public int getUnits()
    {
        switch (code){
            case 2087:
                units = 2;
                break;
            case 2089:
                units = 4;
                break;
            case 2088:
                units = 2;
                break;
            case 2090:
                units = 4;
                break;
            default:
                break;
        }
        return units;
    }
    
    public int getFees()
    {
        if(units == 2){
            fees = 1500 * units;     
        }
        else if(units == 4){
            fees = 1700 * units;
        }
        
        return fees;
    }
}
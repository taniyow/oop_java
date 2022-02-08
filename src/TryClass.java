public class TryClass{
   
    private String variable; //variable as FIELD
    private int numbers;
    
    public void setVar(String var1) //local method of the subclass
    {
        variable = var1; //FIELD variable is invoke to accept var1 as its data
    }
    
    public String getVar()
    {
        return variable; //FIELD variable to be returned
    }
    
    public int getNumber()
    {
        //note that you can create a method that do not have setter
        //setters are all set of inputs from user
        //getters are all set of execution and output of the program
        //you can create your conditional, looping arguments on most getters
        return numbers;
    }
}
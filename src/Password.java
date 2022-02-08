// Group2 - Katrine Dela Cruz
//          Angelo Dy-Reyes
//          Charles Albert Garcia
//          Jarell Galura
//          Mark Christian Tan 

//Subclass of ValidatePassword.java
package Midterms;
class Password {
    private String password; 
    private int uppercase; 
    private int lowercase; 
    private int digits; 
    
    public void setPassword(String pass)
    {
        password = pass;
    }

    public int getUpper()
    {
        int count = 0;
        for(int i=0;i<password.length();++i){
            if(Character.isUpperCase(password.charAt(i))) count=count+1;
        }
        uppercase = count;
        return uppercase;
    }

    public int getLower()
    {
        int count = 0;
        for(int i=0;i<password.length();++i){
            if(Character.isLowerCase(password.charAt(i))) count=count+1;
        }
        lowercase = count;
        return lowercase;
    }

    public int getDigits()
    {
        int count = 0;
        for(int i=0;i<password.length();++i){
            if(Character.isDigit(password.charAt(i))) count=count+1;
        }
        digits = count;
        return digits;
    }
}
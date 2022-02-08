import java.util.Scanner;
public class TryMain{ //class that have main method
    
    public static void main(String args[]){ // Note: public static void main method in main class
        
        TryClass access = new TryClass(); //create an instance from other class that dont have main method
        TryMain main = new TryMain(); // you can also create an instance to access encapsulated method inside main class
        
        input(access); //method from subclass. "access" is an instance var
        printThis(main); //method from main class. "main" is an instance var
        print(); //static method that do not have instance
        output(access); //method from subclass. "access" is an instance var
    }
    
    private static TryClass input(TryClass word) //encapsulated method accessing subclass
            // note that we didnt created an instance to access the subclass
            // this kind of method is abstraction and polymorphism
            // polymorphism is a method with instance intialized as parameter
    {
        String var;
        
        Scanner keyboard = new Scanner(System.in); //instance to access default Scanner class from java library
        
        System.out.print("Enter first name: >> ");
        var = keyboard.nextLine();
        
        word.setVar(var); //pass the data to a setter method from subclass
        // setVar is a method from subclass
        //word is an instance variable
        return word; //returner so that the method will have data
    }
    
    private static TryClass output(TryClass word) //encapsulated method accessing subclass
    {
        System.out.println(word.getVar()); //getVar is a method from subclass
        return word;//returner so that the method will have data
    }
    
    private static void print() //static void method that do not have instances and parameter values
            // used if there are no parameter values needed to pass
    {
       System.out.println("This will get the value in TryClass: ");
    }
    
    private static TryMain printThis(TryMain word) //encapsulated method accessing the main class
    {
       System.out.println("This will get the value in TryClass: ");
       return word;
    }
}
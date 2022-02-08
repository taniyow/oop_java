import java.util.*;

public class ComShop {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter computer cafe:");
        String sp = input.nextLine();
        Shop s = new Shop(sp);
        System.out.print("Enter number of users: ");
        int users = input.nextInt();
        for (int i = 0; i < users; i++) {
            System.out.println("User " + (i+1));
            System.out.print("Enter name: ");
            String name = input.next();
            System.out.print("Enter hours: ");
            int hrs = input.nextInt();
            Account g = new Account(name,hrs);
            s.addUser(g);
        }
        s.display();
      
    }
}

class Account{
    private String name;
    private final int price = 15;
    private int hrs;
    
   
    public String getName() {
        return name;
    }

    public int getHrs() {
        return hrs;
    }
    
    public int calculate(){
        return getHrs() * this.price;
    }
    
    public Account(String name, int hrs){
        this.name = name;
        this.hrs = hrs;
        System.out.println("Name: "+getName()+"\t Hour: "+getHrs()+"\t Total amount: "+calculate());
    }
}

class Shop{
    ArrayList<Account> account;
    private String shopname;

    public Shop(String name){
        this.shopname = name;
        account = new ArrayList<Account>();
    }
    
    public String getShopname() {
        return shopname;
    }
    
    public void addUser(Account user) {
        account.add(user); 
    } 
    public ArrayList<Account> display(){
        for (int i = 0; i < account.size() ; i++) {
            System.out.println("Account name: "+ account.get(i).getName());
            System.out.println("Hours Consumed: "+ account.get(i).getHrs());
        }
        return account;
    }
    
}
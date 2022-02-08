import java.util.*;
public class Salary {
    public static void main(String args[]) {
        SalaryClass value = new SalaryClass();
        results(value);
    }
    
    private static SalaryClass salary(SalaryClass value)
    {
        int salary;
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter Salary: ");
        salary = input.nextInt();
        if(salary >= 0) {
            value.setSalary(salary);
        }
        else if(salary < 0) {
            System.out.println("Salary is invalid.");
            System.exit(0);
        }
        return value;
    }
    
    private static SalaryClass results(SalaryClass value)
    {
        salary(value);
        System.out.println("Salary: " + value.getSalary());
        System.out.println("Class Level: " + value.getCLevel());
        double bonus = value.getBonus() * value.getSalary();
        System.out.println("Bonus Salary: " + bonus);
        double total = bonus + value.getSalary();
        System.out.println("Total Salary: " + total);
        return value;
    }
}

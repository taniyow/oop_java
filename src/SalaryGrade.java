import java.util.*;
class SalaryGrade{
    public static void main(String args[]){
        
         SalaryGradeClass access = new SalaryGradeClass();
         output(access);
    }
    
     private static SalaryGradeClass input(SalaryGradeClass data)
    {
        int grade,hours;
        String name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter name: ");
        name = input.next();
        data.setName(name);
        
        System.out.print("\nEnter SG Level: ");
        grade = input.nextInt();
        data.setGrade(grade);
        
        System.out.print("\nEnter Numeber of Hours: ");
        hours = input.nextInt();
        data.setHours(hours);
        
        return data;
    }   
     
      private static SalaryGradeClass output(SalaryGradeClass data)
    {
        input(data);
        System.out.println("\nEmployee Name is" + " " + data.getName()+ " with Salary Grade Level: " + data.getGrade());
        System.out.println("No. of Hours Worked: " + data.getHours());
        double total = data.getHours() * data.getSalary();
        System.out.println("Total Salary: P" + total);
        double bonus = total * data.getBonus();
        double summary = total + bonus;
        System.out.println("Bonus Salary: P" + bonus);
        System.out.println("Salary Summary: P" + summary);
        return data;
    }   
}
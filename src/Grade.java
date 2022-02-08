import java.util.*;
class Grade {
    public static void main(String[] args)
    {
        Grade result = new Grade();
        GradeClass access = new GradeClass();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Score to Grade Equivalency");
        System.out.println("Scores must be from 0-100");
        
        String answer;
        do {
            output(result);
            System.out.print("\nTry again? [Y/N]: ");
            answer = input.nextLine();
            access.setAnswer(answer);
        } while(access.getAnswer().equals("Y") || access.getAnswer().equals("y"));
    }
    
    private static GradeClass input(GradeClass data)
    {
        int score;
        Scanner input = new Scanner(System.in);
        
        System.out.print("\nEnter Score: ");
        score = input.nextInt();
        if(score>=0)data.setScore(score);
        else if(score<0) {
            System.out.println("Invalid input. Program Exit.");
            System.exit(0);
        }
        return data;
    }
    
    private static Grade output(Grade data)
    {
        GradeClass result = new GradeClass();
        input(result);
        System.out.println("Your Score is " + result.getScore());
        System.out.println("Rate: " + result.getRate());
        System.out.println("Grade: " + result.getEquivalent());
        return data;
    }
}

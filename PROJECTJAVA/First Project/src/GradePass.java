package src;
public class GradePass {
    public static void main(String[] args) {
        int avg = (79+70+70)/3;
        System.out.println("your average grade is: " + avg);
        
        if (avg >= 75 & avg >= 99){
            System.out.println("Passed");
        }
        else if ((avg >= 60) & (avg <= 74))
        {
            System.out.println("Failed");
        }
        else {
            System.out.println("Invalid");
        }
    }
    
}
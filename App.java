import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);
 
    private static String getString(String prompt){
        System.out.println(prompt);
        String userInput = inputScanner.nextLine();
        return userInput;
    }
   
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        double userInput = inputScanner.nextDouble();
        return userInput;
    }
    

   public static void main(String[] args) {
        App app = new App();
           
        String stringPrompt = ("Please enter a string:");
        String doublePrompt = ("Please enter the first number:");
        String ddoublePrompt= ("Please enter the second number: ");

        double num1= app.getDouble(doublePrompt);
        double num2 = app.getDouble(ddoublePrompt);
       // String nums = String.format("You want to add %d and %d", num1, num2);
       // System.out.println(nums);
       Calculator calculator = new Calculator();
              Calculator.add(num1, num2); 
                System.out.println(sum);
            Calculator.multiply(num1, num2);
            Calculator.subtract(num1, num2);
            Calculator.divide(num1,num2);
    }
}

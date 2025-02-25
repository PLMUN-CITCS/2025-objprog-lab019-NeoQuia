import java.util.Scanner;
public class FactorialCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput){
            System.out.print("Enter a non-negative integer: ");
            if (input.hasNextInt()){
                number = input.nextInt();
                if (number >= 0){
                    validInput = true;
                } else {
                System.out.println("Invalid Input. Please enter a NonNegative Number");
                input.next();
                }
            }
        }
        calculateFactorial(number);
    }
    public static void calculateFactorial(int number){
        long factorial = 1;
        if (number == 0){
            factorial = 1;
        } else {
            for (int i = 1; i <= number; ++ i){
            factorial *= i;
            } 
        }
        System.out.println("The factorial of " + number + " is : " + factorial );
    }
}
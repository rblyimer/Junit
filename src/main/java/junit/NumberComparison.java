package junit;
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        int num1 = firstInput();
        int num2 = secondInput();
        System.out.println(comparison(num1,num2));
    }
    public static int firstInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        return  in.nextInt();
    }
    public static int secondInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter second number: ");
        return in.nextInt();
    }
    public static String comparison(int num1, int num2){
        if (num1 == num2) {
            return "The numbers are the same";
        }
        else if (num1 < num2) {
            return "The first number is less than the second number";
        }
        else {
            return "The first number is greater than the second number";
        }
    }
}
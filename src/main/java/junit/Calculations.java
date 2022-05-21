package junit;

// import java.util.Scanner;
// public class Calculations {
    
//     public static void main(String[] args) throws Exception {
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num1 = scan.nextInt();
//         System.out.println("Enter another number: ");
//         int num2 = scan.nextInt();
        
//         int Addition = num1 + num2;
//         System.out.println(num1 + " + " + num2 + " = " + Addition);
        
//         int Substraction = num1 - num2;
//         System.out.println(num1 + " - " + num2 + " = " + Substraction);
        
//         int Multiplication = num1 * num2;
//         System.out.println(num1 + " * " + num2 + " = " +  Multiplication);

//         double Division = (double)num1 / (double)num2;
//         System.out.println(num1 + " / " + num2 + " = " + Division);
        
//         int Modulus = num1 % num2;
//         System.out.println(num1 + " % " + num2 + " = " +  Modulus);
//         scan.close();
//     }
// }

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num1 = input();
        System.out.println("Enter another number:");
        int num2 = input();
        results(num1,num2);
    }

    public static int input(){
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    public static int Addition(int num1, int num2){
        return num1 + num2;
    }
    public static int Subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int Multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static double Division(int num1, int num2){
        return (double) num1 /(double) num2;
    }
    public static int Modulus(int num1, int num2){
        return num1 % num2;
    }
    public static void results(int num1, int num2){
        int sum = Addition(num1,num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);
        int subtractionr = Subtraction(num1,num2);
        System.out.println(num1 + " - " + num2 + " = " + subtractionr);
        int multiplicationr = Multiplication(num1,num2);
        System.out.println(num1 + " * " + num2 + " = " + multiplicationr);
        double divisionr = Division(num1,num2);
        System.out.println(num1 + " / " + num2 + " = " + divisionr);
        int modulusr = Modulus(num1,num2);        
        System.out.println(num1 + " % " + num2 + " = " + modulusr);
    }
}
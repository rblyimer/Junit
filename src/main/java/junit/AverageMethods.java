package junit;

import java.util.Scanner;
public class AverageMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = in.nextDouble();
        System.out.println("Enter second number");
        double num2 = in.nextDouble();
        System.out.println("Enter third number");
        double num3 = in.nextDouble();
        System.out.println("The average is "+ average(num1,num2,num3));
        in.close();
    }
    public static double sum(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }
    public static double average(double num1, double num2, double num3) {
        return sum(num1, num2, num3) / 3;
    }
}

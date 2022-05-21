package junit;

import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You may now enter a Numerator:");
        int num1 = scanner.nextInt();
        System.out.println("Thou shall enter a Denominator:");
        int num2 = scanner.nextInt();
        Divide(num1, num2);
        scanner.close();
    }
    public static void Divide(int a, int b) {
        System.out.println(a + " / " + b + " = " + (double)a / (double)b);
    }
}

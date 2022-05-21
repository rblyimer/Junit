package junit;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) throws Exception{
        int num = input();
        System.out.println(WaterBoiling(num));
    }
    public static int input(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");
        return in.nextInt();
    }
    public static String WaterBoiling(int num){
        if (num > 212) {
            return "Water is boiling!";
        } else {
            return "Water is not boiling!";
        }
    }
}

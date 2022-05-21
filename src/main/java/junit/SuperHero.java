package junit;
import java.util.Scanner;

public class SuperHero {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        superHero();
        superPower();
        Story();
    }

    public static String superHero() {
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String name = in.nextLine();
        return "The hero of our story is " + name;
    }
    public static String superPower() {
        System.out.println("What is their superpower?");
        String superpower = in.nextLine();
        return "Their superpower is " + superpower;
    }
    public static String Story() {
        System.out.println
        (
            "Here is the story:\n" +
            "There once was a superhero named SpiderMan, who had the power of helping. \n" +
            "As he grew older, Spiderman saw that the world needed him. \n" +
            "and, used his ability to save the world."
        );
        return null;
    }        
}
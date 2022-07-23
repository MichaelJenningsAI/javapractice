import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args)
    {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Enter two whole numbers");
            System.out.println("seperated by one or more spaces:");
            
            int n1, n2;
            n1 = keyboard.nextInt();
            n2 = keyboard.nextInt();
            System.out.println("You entered " + n1 + " and " + n2);
            System.out.println("Next enter two words:");
            String s1, s2;
            s1 = keyboard.next();
            s2 = keyboard.next();
            System.out.println("You entered \"" + s1 + "\" and \"" + s2 + "\"");
            s1 = keyboard.nextLine();
            System.out.println("Next enter a line of text:");
            s1 = keyboard.nextLine();
            System.out.println("You entered \"" + s1 + "\"");
        }       
    }
}

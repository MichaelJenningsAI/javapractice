import java.util.Scanner;

public class FirstProgram
{

    public static void main(String[] args)
    {
        System.out.println("Hello");

        int n1, n2;

        try (Scanner keyboard = new Scanner(System.in)) {
            n1 = keyboard.nextInt();
            n2 = keyboard.nextInt();
        }
        System.out.println(n1 + n2);

    }
}
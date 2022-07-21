import java.util.Scanner;

public class ChangeMaker {
    public static void main(String[] args)
    {
        int amount, originalAmount, quarters, dimes, nickels, pennies;

        System.out.println("Enter a number between 1 to 99.");
        System.out.println("I will find a combination of coins");
        System.out.println("that equals that amount of change.");
        try (Scanner keyboard = new Scanner(System.in)) {
            amount = keyboard.nextInt();
        }
        originalAmount = amount;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickels = amount / 5;
        amount = amount % 5;
        pennies = amount;
        System.out.print(originalAmount + " cents in coins can be given as: ");
        System.out.print(quarters + " quarters, ");
        System.out.print(dimes + " dimes, ");
        System.out.print(nickels + " nickels, ");
        System.out.print(pennies + " pennies.");
    }
}

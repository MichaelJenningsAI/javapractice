import java.util.Scanner;

public class SmsCost {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int numOfMessages, SETUPCOST = 10;
        double UNITCOST = 0.22, outputCost;
        System.out.println("Please Input Number of Messages:");
        numOfMessages = keyboard.nextInt();
        outputCost = SETUPCOST + (UNITCOST * numOfMessages);
        System.out.println("The total cost of your phone plan is : $" + outputCost);
    }
}

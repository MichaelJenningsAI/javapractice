import java.util.*;
public class Salary
{
    public static void main (String[] args)
    {
        try (Scanner console = new Scanner(System.in)) {
            double normalw1,extraw1,normalw2,extraw2,total;
            String bonus;
            bonus = "";
            System.out.println("Please Enter number of normal hours week 1: ");
            normalw1 = console.nextDouble();
            System.out.println("Please Enter number of extra hours for week 1: ");
            extraw1 = console.nextDouble();
            total = 10*normalw1+15*extraw1;
            System.out.println("Please Enter number of normal hours for week 2: ");
            normalw2 = console.nextDouble();
            System.out.println("Please Enter number of extra hours for week 2: ");
            extraw2 = console.nextDouble();
            total = 10*normalw2+15*extraw2+total;
        System.out.println("Total salary is: "+ total +"\n");
        if (total >=500 && total < 1000){
            total = total * 1.05;
            bonus = "5%";
        }
        else if (total < 500){
            total = total * 1.10;
            bonus = "10%";
        }
        else
            bonus = "No Bonus!";
        System.out.println("Bonus is: "+ bonus);
        System.out.println("Total salary after bonus is: "+ total +"\n");
        }   
    }
}
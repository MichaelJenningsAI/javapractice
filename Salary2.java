/* 
 * Firstnam + Last name
 * Salary in 2020
 * Salary increment % in 2021
 * Salary per week
 * Output name and salary per week
*/

import java.util.Scanner;

public class Salary2 {
    public static void main(String[] args)
    {
        String firstName;
        String lastName;
        String fullName;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Input your first name then your second name:");
        firstName = keyboard.next();
        lastName = keyboard.next();
        fullName = firstName + " " + lastName;

        double lastYearSalary, currentYearSalary, payIncrement, weeklySalary;
        int weeklySalaryRemainder;

        System.out.println("Please Input Last Year Salary:");

        lastYearSalary = keyboard.nextInt();

        System.out.println("Please Input Increment Increase %:");
        payIncrement = keyboard.nextInt();

        currentYearSalary = lastYearSalary + (lastYearSalary * (payIncrement / 100));
        weeklySalary = currentYearSalary / 52;
        weeklySalaryRemainder = (int)(currentYearSalary % 52);
        System.out.println(fullName + " - $" + (int)weeklySalary + "." + weeklySalaryRemainder);
    }
}
import java.util.Scanner;

public class FullName {
    public static void main(String[] args)
    {
        String first1, first2, lastName, combined1, combined2;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Input your first name, your partners first name and then your last name:");
        first1 = keyboard.next();
        first1 = first1.strip().toUpperCase();
        first2 = keyboard.next();
        first2 = first2.strip().toUpperCase();
        lastName = keyboard.next();
        lastName = lastName.strip().toUpperCase();
        combined1 = first1 + " " + lastName;
        combined2 = first2 + " " + lastName;
        System.out.println("Your Full Names are: " + combined1 + " AND " + combined2 + ".");
    }
}
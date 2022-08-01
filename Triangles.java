import java.util.Scanner;

public class Triangles {
    public static void main(String[] args)
    {
        int side1, side2, side3;
        String outputstr;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter 3 sides of a triangle as full numbers:");
        side1 = keyboard.nextInt();
        side2 = keyboard.nextInt();
        side3 = keyboard.nextInt();

        if (side1 == side2 && side2 == side3)
            outputstr = "equilateral triangle"; //three equal sides
        else if (side1 == side2 || side2 == side3 || side1 == side3)
            outputstr = "isosceles triangle"; //two equal sides
        else
            outputstr = "scalene triangle"; //three different sides


        // - No side of a triangle can be greater than the sum of the other two sides.
        if (side1 > side2 + side3)
            outputstr = "invalid triangle";
        if (side2 > side1 + side3)
            outputstr = "invalid triangle";
        if (side3 > side1 + side2)
            outputstr = "invalid triangle";

        System.out.println(outputstr);
    }
}
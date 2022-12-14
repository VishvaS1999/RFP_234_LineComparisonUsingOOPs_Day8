package com.LineComparision;

import java.util.Scanner;

public class CalculateLength
{
    public static float length;

    public static float line_1;

    public static float line_2;

    public static int x1, x2, y1, y2;

    public static void inputs ()
    {
        //Calculating Length for Line 1 by taking values
        System.out.println("Enter The values for Line 1");
        length();
        System.out.println("Length of LINE-1  points " + "(" + x1 + "," + y1 + ") & " + "(" + x2 + "," + y2 + ") " + "is " + length + "\n");
        line_1 = length;
        //Calculating Length for Line 2 by taking values
        System.out.println("Enter The values for Line 2");
        length();
        System.out.println("Length of LINE-2  points " + "(" + x1 + "," + y1 + ") & " + "(" + x2 + "," + y2 + ") " + "is " + length + "\n");
        line_2 = length;
        compare();
    }
    public static void compare ()
    {
        //Comparing the line lengths
        int compare = Float.compare(line_1, line_2);
        if (compare == 0)
        {
            System.out.println("Length of LINE-1 & LINE-2 are equal.");
        }
        else if (compare > 0)
        {
            System.out.println("length of LINE-1 is greater than LINE-2.");
        }
        else
        {
            System.out.println("length of LINE-1 is smaller than LINE-2.");
        }
    }
    public static void length ()
    {
        Scanner scan = new Scanner(System.in);
        //scanning user input values
        System.out.println("Enter the x1 value for Line:");
        x1 = scan.nextInt();
        System.out.println("Enter the y1 value for Line:");
        y1 = scan.nextInt();
        System.out.println("Enter the x2 value for Line:");
        x2 = scan.nextInt();
        System.out.println("Enter the y2 value for Line:");
        y2 = scan.nextInt();
        //Calculating the length using formula
        length = (float) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    public static void main(String[] args)
    {
        CalculateLength lengthCompareRef = new CalculateLength();
        lengthCompareRef.inputs();

    }
}

package com.LineComparision;

import java.util.Scanner;

public class CalculateLength
{
    public static double x1, x2, y1, y2;
    public static void length()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of x1:");
        x1 = sc.nextDouble();

        System.out.println("Enter The Value Of y1:");
        y1 = sc.nextDouble();

        System.out.println("Enter The Value Of x2:");
        x2 = sc.nextDouble();

        System.out.println("Enter The Value Of y2:");
        y2 = sc.nextDouble();

        double len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of the given Line is : " + len + " units" );
    }
    public static void main(String[] args)
    {
        length();
    }
}

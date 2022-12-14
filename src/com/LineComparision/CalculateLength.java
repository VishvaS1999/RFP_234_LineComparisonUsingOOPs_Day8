package com.LineComparision;

import java.util.Scanner;

public class CalculateLength
{
    public static double x1, x2, x3, x4, y1, y2 ,y3 ,y4;
    public static void length()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number x1 : ");
        x1 = sc.nextDouble();
        System.out.println("Enter The Number y1 : ");
        y1 = sc.nextDouble();
        System.out.println("Enter the Number x2 : ");
        x2 = sc.nextDouble();
        System.out.println("Enter the Number y2 : ");
        y2 = sc.nextDouble();
        Double len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Length of the given Line is : " + len + " units" );

        System.out.println("Enter the Number x3 : ");
        x3 = sc.nextDouble();
        System.out.println("Enter the Number y3 : ");
        y3 = sc.nextDouble();
        System.out.println("Enter the Number x4 : ");
        x4 = sc.nextDouble();
        System.out.println("Enter the Number y4 : ");
        y4 = sc.nextDouble();
        Double len1 = Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("Length of the given Line is : " + len1 + " units" );

        //System.out.println(len.equals(len1));
        if(len.equals(len1))
            System.out.println("both lines are equal");
        else
            System.out.println("not equal");
    }
    public static void main(String[] args)
    {
        length();
    }
}

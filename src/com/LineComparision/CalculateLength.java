package com.LineComparision;

import java.util.Scanner;

public class CalculateLength
{
    public static double x1, x2, x3, x4, y1, y2 ,y3 ,y4;
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

        double len = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Of Line Is :" + len);

        System.out.println("Enter The Value Of x3:");
        x3 = sc.nextDouble();

        System.out.println("Enter The Value Of y3:");
        y3 = sc.nextDouble();

        System.out.println("Enter The Value Of x4:");
        x4 = sc.nextDouble();

        System.out.println("Enter The Value Of y4:");
        y4 = sc.nextDouble();

        double len1 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length Of Line Is :" + len1);

        if (len == len1)
        {
            System.out.println("length of both line are equal:");
        }
        else if (len > len1)
        {
            System.out.println("length is greater then other line:");
        }
        else
        {
            System.out.println("length is less then other line:");
        }

    }
    public static void main(String[] args)
    {
        length();
    }
}

package com.bridgelabz.practiceproblems1;
import java.util.Scanner;
public class harmonicNumber {

        public static void main(String[] args)
        {
            int a;
            double result = 0;
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            if(a!=0)
            {
                for(double i=1;i<a+1;i++)
                {
                    result = result +(1/i);
                }
                System.out.println(result);
            }
            else
            {
                System.out.println("Enter a valid number");
            }
        }
    }


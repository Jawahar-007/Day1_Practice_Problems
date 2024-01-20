package com.bridgelabz.practiceproblems1;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter A value : ");
            int a = scanner.nextInt();

            System.out.println("Enter B Value : ");
            int b = scanner.nextInt();
            a = a*b;
            b = a/b;
            a = a/b;
            System.out.println(a);
            System.out.println(b);
        }
    }


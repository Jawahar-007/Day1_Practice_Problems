package com.bridgelabz.practiceproblems1;
import java.util.Scanner;
public class largestofThreeNo {

        public static void main(String[] args){
            int a ,b,c;
            Scanner scanner = new Scanner(System.in);
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();

            if (a>b || a>c)
                System.out.println("a is the biggest number");
            else if (b>a || b>c)
                System.out.println("b is the biggest number");
            else
                System.out.println("c ia the biggest number");



        }
    }


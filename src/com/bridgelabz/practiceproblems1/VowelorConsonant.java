package com.bridgelabz.practiceproblems1;
import java.util.Scanner;
public class VowelorConsonant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        char ch = scanner.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Its a vowel");
        else
            System.out.println("Its a consonant");
    }
}
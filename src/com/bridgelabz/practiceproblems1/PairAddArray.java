package com.bridgelabz.practiceproblems1;

public class PairAddArray {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5}; // Updated the array to {1, 2, 3, 4, 5}

            for (int i = 0; i < numbers.length - 1; i += 2) {
                int firstNumber = numbers[i];
                int secondNumber = numbers[i + 1];

                //  average Calculation
                double average = (firstNumber + secondNumber) / 2.0;

                System.out.println("Pair: (" + firstNumber + ", " + secondNumber + "), Average: " + average);
            }
        }
    }


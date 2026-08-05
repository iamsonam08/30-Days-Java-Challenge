/*
Problem: Sum of Digits Using Recursion
Concept: Recursion
Time Complexity: O(d)
Space Complexity: O(d)
*/

import java.util.Scanner;

public class SumOfDigitsRecursion {

    static int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Sum of Digits = " + sumOfDigits(number));

        sc.close();
    }
}

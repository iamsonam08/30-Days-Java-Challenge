/*
Problem: Factorial Using Method
Concept: Methods
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class FactorialMethod {

    static int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + factorial(n));

        sc.close();
    }
}

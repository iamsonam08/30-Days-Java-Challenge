/*
Problem: Add Two Numbers
Concept: Variables and Scanner
Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

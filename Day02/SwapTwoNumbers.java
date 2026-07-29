/*
Problem: Swap Two Numbers
Concept: Variables
Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();
    }
}

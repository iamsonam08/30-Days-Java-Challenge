/*
Problem: Sum of First N Natural Numbers
Concept: for Loop
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class SumOfFirstN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}

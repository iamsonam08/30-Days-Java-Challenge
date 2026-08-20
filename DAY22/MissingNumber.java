/*
Problem: Find Missing Number
Concept: Arrays and Mathematics
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < n - 1; i++) {
            sum += sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int missing = expectedSum - sum;

        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}

/*
Problem: Two Sum
Concept: Arrays and Nested Loops
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] + arr[j] == target) {

                    System.out.println(
                        arr[i] + " + " + arr[j] + " = " + target
                    );

                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No pair found.");
        }

        sc.close();
    }
}

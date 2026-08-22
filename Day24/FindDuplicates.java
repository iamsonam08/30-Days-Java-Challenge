/*
Problem: Find Duplicate Elements
Concept: Arrays and Nested Loops
Time Complexity: O(n^2)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements:");

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println(arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}

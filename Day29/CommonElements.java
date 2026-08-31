/*
Problem: Find Common Elements in Two Arrays
Concept: Array Traversal and Searching
Time Complexity: O(n * m)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class CommonElements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];

        System.out.println("Enter first array elements:");

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        int[] arr2 = new int[m];

        System.out.println("Enter second array elements:");

        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        boolean[] printed = new boolean[n];

        System.out.println("Common Elements:");

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (printed[i]) {
                continue;
            }

            for (int j = 0; j < m; j++) {

                if (arr1[i] == arr2[j]) {

                    System.out.println(arr1[i]);

                    printed[i] = true;
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No common elements found.");
        }

        sc.close();
    }
}

/*
Problem: Find Frequency of an Element
Concept: Arrays and Searching
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class FrequencyOfElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find frequency: ");
        int target = sc.nextInt();

        int frequency = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                frequency++;
            }
        }

        System.out.println("Frequency of " + target + " = " + frequency);

        sc.close();
    }
}

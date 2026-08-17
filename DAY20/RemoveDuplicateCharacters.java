/*
Problem: Remove Duplicate Characters
Concept: String Traversal and Searching
Time Complexity: O(n^2)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class RemoveDuplicateCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            boolean alreadyExists = false;

            for (int j = 0; j < result.length(); j++) {

                if (result.charAt(j) == current) {
                    alreadyExists = true;
                    break;
                }
            }

            if (!alreadyExists) {
                result = result + current;
            }
        }

        System.out.println("String after removing duplicates = " + result);

        sc.close();
    }
}

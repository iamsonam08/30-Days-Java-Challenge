/*
Problem: First Non-Repeating Character
Concept: String Traversal and Frequency
Time Complexity: O(n^2)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);
            int frequency = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == current) {
                    frequency++;
                }
            }

            if (frequency == 1) {
                System.out.println(
                    "First non-repeating character = " + current
                );
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character found");
        }

        sc.close();
    }
}

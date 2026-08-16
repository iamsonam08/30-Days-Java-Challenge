/*
Problem: Count Words in a String
Concept: String Traversal
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        int words = 0;

        if (!str.isEmpty()) {
            words = 1;

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ' ') {
                    words++;
                }
            }
        }

        System.out.println("Number of words = " + words);

        sc.close();
    }
}

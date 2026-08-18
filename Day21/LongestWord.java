/*
Problem: Find the Longest Word in a Sentence
Concept: Strings and Word Traversal
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class LongestWord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i <= str.length(); i++) {

            if (i < str.length() && str.charAt(i) != ' ') {

                currentWord = currentWord + str.charAt(i);

            } else {

                if (currentWord.length() > longestWord.length()) {
                    longestWord = currentWord;
                }

                currentWord = "";
            }
        }

        System.out.println("Longest word = " + longestWord);
        System.out.println("Length = " + longestWord.length());

        sc.close();
    }
}

/*
Problem: Check Anagram
Concept: Strings and Character Frequency
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CheckAnagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            sc.close();
            return;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
            frequency[str2.charAt(i)]--;
        }

        boolean isAnagram = true;

        for (int i = 0; i < frequency.length; i++) {

            if (frequency[i] != 0) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        sc.close();
    }
}

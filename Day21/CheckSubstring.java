/*
Problem: Check if a String is a Substring
Concept: Strings and Searching
Time Complexity: O(n * m)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CheckSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        System.out.print("Enter string to search: ");
        String target = sc.nextLine();

        boolean found = false;

        for (int i = 0; i <= str.length() - target.length(); i++) {

            int j;

            for (j = 0; j < target.length(); j++) {

                if (str.charAt(i + j) != target.charAt(j)) {
                    break;
                }
            }

            if (j == target.length()) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Substring Found");
        } else {
            System.out.println("Substring Not Found");
        }

        sc.close();
    }
}

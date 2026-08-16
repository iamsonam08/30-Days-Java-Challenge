/*
Problem: Remove Spaces from a String
Concept: String Traversal
Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                result = result + ch;
            }
        }

        System.out.println("String without spaces = " + result);

        sc.close();
    }
}

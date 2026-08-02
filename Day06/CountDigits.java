/*
Problem: Count Digits
Concept: while Loop
Time Complexity: O(d)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = 0;

        while (number != 0) {
            count++;
            number = number / 10;
        }

        System.out.println("Total Digits = " + count);

        sc.close();
    }
}

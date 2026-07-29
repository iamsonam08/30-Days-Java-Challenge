/*
Problem: Even or Odd
Concept: Modulus Operator and if-else
Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        sc.close();
    }
}

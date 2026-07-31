/*
Problem: Calculator using Switch
Concept: Switch Statement
Time Complexity: O(1)
Space Complexity: O(1)
*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println("Result = " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero.");
                break;

            case '%':
                System.out.println("Result = " + (num1 % num2));
                break;

            default:
                System.out.println("Invalid Operator");
        }

        sc.close();
    }
}

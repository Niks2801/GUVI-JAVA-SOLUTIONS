Complex Variable Initialization and Arithmetic Operations

Problem Statement
Write a program that takes four integers as input, performs a series of arithmetic operations using these integers, and outputs the results in a specific format.

Description
You need to declare four integer variables, perform the following operations, and print the results:

    Add the first and the second integer, then multiply the result by the third integer.
    Subtract the fourth integer from the second integer, then divide the result by the first integer.
    Multiply the first integer by the fourth integer, then add the third integer to the result.
    Add all four integers together and divide by two.

Input Format
Four integers, each on a new line.

Output Format
Four lines of output, each showing the result of the respective operations in the following format:
Result of operation 1: <result>
Result of operation 2: <result>
Result of operation 3: <result>
Result of operation 4: <result>

Sample Input:
3
4
2
1

Sample output:
Result of operation 1: 14
Result of operation 2: 1
Result of operation 3: 5
Result of operation 4: 5

SOLUTION-

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        //..... YOUR CODE STARTS HERE .....
    int result1 = (a + b) * c;
        double result2 = (double) (b - d) / a;
        int result3 = a * d + c;
        double result4 = (a + b + c + d) / 2.0;

        System.out.println("Result of operation 1: " + result1);
        System.out.println("Result of operation 2: " + (int) result2);
        System.out.println("Result of operation 3: " + result3);
        System.out.println("Result of operation 4: " + (int) result4);
        
        //..... YOUR CODE ENDS HERE .....
    }
}


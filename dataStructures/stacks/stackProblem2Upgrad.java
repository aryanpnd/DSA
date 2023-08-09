/*
Reverse the elements
Description
You are given a stack with n integers. You need to reverse the last half of the elements i.e. floor(n/2) elements from the bottom of the stack using recursion and print the elements of the stack.
Note : Floor function takes input as a real number and it returns the greatest integer less than or equal to the input.  
Ex. floor(5.4) will give output as 5 and floor(4) will give 4.

Example: 
Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
Output: [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]

Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
Output: [1, 2, 3, 4, 5, 6, 11, 10, 9, 8, 7]

Input Format:
12
1 2 3 4 5 6 7 8 9 10 11 12

Output format:
[1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]
 */

import java.util.*;

public class stackProblem2Upgrad {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        // Write your code here
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> tempStack2 = new Stack<>();
        int halfStack = stack.size()/2;
        
        for (int i = 0; i < halfStack; i++) {
            tempStack.push(stack.pop());    
        }
        for (int i = 0; i < halfStack; i++) {
            tempStack2.push(tempStack.pop());    
        }
        for (int i = 0; i < halfStack; i++) {
            stack.push(tempStack2.pop());    
        }

        System.out.println(stack);
    }
}
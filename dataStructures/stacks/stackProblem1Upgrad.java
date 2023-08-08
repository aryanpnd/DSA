/*
 Stacks
Description
Given a sequence S1, check if it exists in another sequence S2. Assume that all the elements are distinct in both the sequences. Sequence S1 exists in sequence S2 if all the elements of S1 appear in S2 and their relative ordering is the same, which means that there may be elements in the middle of two elements in S2, which are adjacent in S1.

Example:
For input: 
S1 = 1 2 3
S2 = 1 4 2 5 6 3
Return: True because S2 also contains 1, 2, 3

For input: 
S1 = 1 2 3
S2 = 1 2 4
Return: False because 3 is not present in S2


TestCases
Input 1:
1 2 3

1 4 2 5 3

Output 1:
true


Input 2:
1 2 3

1 2 4 5

Output 2:
false

 */


import java.util.Scanner;
import java.util.Stack;

public class stackProblem1Upgrad {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        // This block will be filled by the student
        if(sequence1.size()>sequence2.size())return false;
        int count = 0;
        for (int s1 : sequence1) {
            if(sequence2.search(s1)!=-1){
                count++;
            }
        }
        if(count==sequence1.size())return true;
        else return false;
        
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);  
    }
}

import java.util.Scanner;
import java.util.Stack;

public class lpuCseCoreDsaQuestion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrSize1 = sc.nextInt();
        int[] arr1 = new int[arrSize1];
        for (int index = 0; index < arrSize1-1; index++) {
            arr1[index] = sc.nextInt();
        }

        int arrSize2 = sc.nextInt();
        int[] arr2 = new int[arrSize2];
        for (int index = 0; index < arrSize1-1; index++) {
            arr2[index] = sc.nextInt();
        }
        
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i]==arr2[j]) {
                    s.push(i);
                }
            }
        }

        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.pop());
        }

    }    
}

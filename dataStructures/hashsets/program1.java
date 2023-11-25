import java.util.*;

public class program1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        //adding
        set.add(5);
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(2);
        set.add(1);

        // searching
        System.out.println(set.contains(5));
    }
}

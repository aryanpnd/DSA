public class stringPermutation {

    public static void printPermutation(String str, String per){
        if (str.length()==0) {
            System.out.println(per);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0, i)+str.substring(i+1);
            printPermutation(newStr, per+currentChar);
        }
    }

    public static void main(String[] args) {
        String str = "ishaant kumar singh";
        printPermutation(str,"");
    }
}

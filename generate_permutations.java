import java.util.*;

public class generate_permutations  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word to get all Permutations of it: ");
        String str =sc.nextLine();
        generatePermutations(str, "");
    }

    public static void generatePermutations(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generatePermutations(remaining, prefix + ch);
            }
        }
    }
}


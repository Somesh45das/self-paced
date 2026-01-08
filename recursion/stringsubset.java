import java.util.Scanner;

public class stringsubset {
    static void add(String s, String curr, int i) {
        // Base case: if we've processed all characters
        if (i == s.length()) {
            System.out.println(curr);
            return;
        }

        // Recursive case:
        // 1. Exclude current character
        add(s, curr, i + 1);

        // 2. Include current character
        add(s, curr + s.charAt(i), i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String x = sc.next();
        add(x, "", 0);
    }
}

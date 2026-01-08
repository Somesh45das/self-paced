import java.util.Scanner;

public class Palindrome {
    static boolean ispal(String pal, int start, int end) {
        if (start >= end)
            return true;
        return (pal.charAt(start) == pal.charAt(end)) && ispal(pal, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String st = sc.next();
        if (ispal(st, 0, st.length() - 1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

import java.util.Scanner;

public class purmutation {

    static void print(char[] s, int i) {
        if (i == s.length - 1) {
            System.out.println(new String(s));
            return;
        }
        for (int j = i; j < s.length; j++) {
            swap(s, i, j);
            print(s, i + 1);
            swap(s, i, j); // backtrack
        }
    }

    static void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        char[] arr = str.toCharArray();
        print(arr, 0);
    }
}

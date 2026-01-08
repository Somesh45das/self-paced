import java.util.Scanner;

public class joshephus {
    static int jos(int n, int k) {
        if (n == 1) {
            return 0;
        }
        return (jos(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of people");
        int n = sc.nextInt();
        System.out.println("Enter the number of places");
        int k = sc.nextInt();
        int z = jos(n, k);
        System.out.println("The last survivor is " + z);
    }
}
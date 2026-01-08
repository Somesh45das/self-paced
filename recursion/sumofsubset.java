import java.util.Scanner;

public class sumofsubset {
    static int subset(int[] arr, int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return subset(arr, n - 1, sum) + subset(arr, n - 1, sum - arr[n - 1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("ENter the sum");
        int sum=sc.nextInt();
        System.out.println(subset(arr,n,sum));


    }
}

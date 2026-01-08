import java.util.Scanner;

public class sumofdigits {
    static int digit(int n){
        if(n==0){
            return 0;
        }
        return n%10+(digit(n/10));
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
       int x=digit(a);
        System.out.println("the sum of all the digits is"+x);
    }
}

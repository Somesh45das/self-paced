import java.util.Scanner;

public class fibonacci {
    static int fib(int n){
        if(n==0)
            return 0;
        if(n==2 ||n==1)
            return 1;
        else
            return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("The fibonacci number of the given number is "+fib(a));
    }
}

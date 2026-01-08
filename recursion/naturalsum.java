import java.util.Scanner;

public class naturalsum {
    static int sum(int n){
        if(n==0 )
            return 0;
        else
            return n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("The sum  of all natural number till the given number is "+sum(a));
    }
}

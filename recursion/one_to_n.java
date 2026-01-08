import java.util.Scanner;

public class one_to_n {
    static void rec(int n){
        if(n==0)
            return ;
        rec(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        rec(a);
    }
}

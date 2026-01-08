import java.util.Scanner;

public class factorial {
     static int fact(int n){
        if(n==0 ||n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a= sc.nextInt();
        System.out.println("The factorial of the given number is "+fact(a));
    }
}

import java.util.Scanner;

public  class maxpiece {
    static int max(int a,int b,int c){
        if(a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;

        }

    static int piece(int n,int a,int b ,int c) {
        if (n == 0) {
            return 0;
        }
        if (n <0) {
            return -1;
        }
            int res = maxpiece.max(piece(n - a, a, b, c), piece(n - b, a, b, c), piece(n - c, a, b, c));
            if (res == -1)
                return -1;
            return res + 1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
        int c = sc.nextInt();
        int x=piece(n,a,b,c);
        System.out.println("max piece is "+x);
    }
}


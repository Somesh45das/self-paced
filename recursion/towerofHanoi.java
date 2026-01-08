import java.util.Scanner;

public class towerofHanoi {
    static void toh(int n,char A,char B,char C){
        if(n==1){
            System.out.println("move 1 from "+ A+" to "+C);
            return;
        }
        toh(n-1,A,C,B);
        System.out.println("move "+ n +"from "+ A+" to "+C);
        toh(n-1,B,A,C);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of discs");
        int n=sc.nextInt();
        System.out.println("Enter firsy character");
        char x ='a',y='b',z='c';
        toh(n,x,y,z);
    }
}

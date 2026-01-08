import java.util.*;
public class oddnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n= sc.nextInt();
        int[] arrr=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arrr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arrr[i]==arrr[j]){
                    count++;
                }

            }
            if(count%2!=0){
                System.out.println(i);
            }
        }



    }

}
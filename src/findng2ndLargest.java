import java.util.Scanner;

public class findng2ndLargest {
    public static void main(String[] args){
        int n,i,large,large2;
        System.out.print("Enter the number of elemnats you want in array:");
        int[] a=new int[100];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.print("Enter elements you want in array:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        large=large2=a[0];
        for(i=0;i<n;i++){
            if(large<a[i]){
                large=a[i];
            }
        }
        for(i=0;i<n;i++){
            if(a[i]==large){
                continue;
            }
            if(large2<a[i]){
                large2=a[i];
            }
        }

        System.out.print(large2);



    }
}

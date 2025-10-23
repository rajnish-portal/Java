import java.util.Scanner;

public class printingNumbersRecursion {
    public static void nPrint(int n){
        if(n==0){
        return;}
        System.out.println(n);
        nPrint(n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        nPrint(n);
    }
}

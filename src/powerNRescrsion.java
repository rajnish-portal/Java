import java.util.Scanner;

public class powerNRescrsion {
    public static int power(int n,int p){
        if(p==0) return 1;
        int x=n*power(n,p-1);
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.print(power(n,p));
    }}


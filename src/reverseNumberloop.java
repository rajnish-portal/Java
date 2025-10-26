import java.util.Scanner;

public class reverseNumberloop {
    public static void main(String[] args){
        System.out.print("Enter the number you want revrese:");
        int n;
        int rev=0;
        int rem=0;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}

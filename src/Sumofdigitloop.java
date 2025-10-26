import java.util.Scanner;

public class Sumofdigitloop {
    public static void main(String[] args){
        System.out.println("Enter the Number:");
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        int rem;
        while(n!=0){
            rem=n%10;
            sum=rem+sum;
            n=n/10;
        }
        System.out.println(sum);
    }
}

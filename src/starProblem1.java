import java.util.Scanner;

public class starProblem1{
    public static void main(String[] args){
        System.out.print("Enter the number of line you want:");
        Scanner se=new Scanner(System.in);
        int n;
        n= se.nextInt();
        for(int i=0;i<n;++i){
            System.out.print("*");

        }
        System.out.print("\n");
        for(int i=0;i<n;++i){
            for(int j=0;j<=i;++j){
            System.out.print("*");}
            System.out.print("\n");

        }
        System.out.print(" ");
        System.out.print("\n");
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");}
            System.out.print("\n");

        }
        System.out.print(" ");
    }
}

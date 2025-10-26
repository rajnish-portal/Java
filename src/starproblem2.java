import java.util.Scanner;

public class starproblem2 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the number of lines you want:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=n;i>=0;--i){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=n-i;k>0;k--){
                System.out.print("* ");
            }

            System.out.print("\n");}
            int n1;
            System.out.print("Enter the number of lines you want:");
            n1=sc.nextInt();
            for(int i1=n1;i1>=0;--i1){
                for(int j=i1;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=n1-i1;k>0;k--){
                    System.out.print("* ");
                }

                System.out.print("\n");

        }
            for(int a=n-1;a<n1;++a){
                for(int b=0;b<a;b++){
                    System.out.print(" ");
                }
                for(int c=0;c<a;c++){
                    System.out.print("* ");
                }
                System.out.print("\n");
            }

    }
    }


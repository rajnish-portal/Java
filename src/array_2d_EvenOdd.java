import java.util.Scanner;

public class array_2d_EvenOdd {
    public static void main(String[] args){
        System.out.println("This codes contains info about Arrays");
        int[][] a=new int[100][100];
        int b1,b2,c;
        System.out.print("enter the number of row you want to enter in Array:");
        Scanner sc=new Scanner(System.in);
        b1=sc.nextInt();
        System.out.print("enter the number of row you want to enter in Array:");
        b2=sc.nextInt();
        System.out.println("Enter the value.");
        for(int i=0;i<b1;i++){
            for(int j=0;j<b2;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println(" ");

        }
        for(int i=0;i<b1;i++){
            for(int j=0;j<b2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        int even=0;
        int odd=0;
        int[] evens=new int [100];
        int[] odds=new int [100];
        int p1=0;
        int p2=0;
        for(int i=0;i<b1;i++){
            for(int j=0;j<b2;j++){
                if(a[i][j]%2==0){
                   even++;
                   int x=a[i][j];
                   evens[p1]=x;
                   p1++;
                }
                else{
                    odd++;
                    int x=a[i][j];
                    odds[p2]=x;
                    p2++;
                }
            }}

        System.out.println("Evens:"+even+" Odds:"+odd);
        System.out.println( "Evens:");
        for(int i=0;i<p1;i++){
            System.out.print(evens[i]+" ");
        }
        System.out.println( "\nOdds:");
        for(int i=0;i<p2;i++){
            System.out.print(odds[i]+" ");
        }

    }}

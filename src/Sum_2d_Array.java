import java.util.Scanner;

public class Sum_2d_Array {
    public static void main(String[] args){
        System.out.println("This codes contains info about Arrays");
        int[][] a=new int[100][100];
        int[][] a2=new int[100][100];
        int b1,b2,c,d1,d2;
        System.out.print("enter the number of row you want to enter in 1st Array:");
        Scanner sc=new Scanner(System.in);
        b1=sc.nextInt();
        System.out.print("enter the number of coloumn you want to enter in 1st Array:");
        b2=sc.nextInt();
        System.out.println("Enter the value.");
        for(int i=0;i<b1;i++){
            for(int j=0;j<b2;j++){
                a[i][j]=sc.nextInt();
            }
            System.out.println(" ");

        }
        System.out.print("enter the number of row you want to enter in 2nd Array:");
        d1=sc.nextInt();
        System.out.print("enter the number of coloumn you want to enter in 2nd Array:");
        d2=sc.nextInt();
        System.out.println("Enter the value.");
        for(int i=0;i<d1;i++){
            for(int j=0;j<d2;j++){
                a2[i][j]=sc.nextInt();
            }
            System.out.println(" ");

        }
        for(int i=0;i<b1;i++){
            for(int j=0;j<b2;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for(int i=0;i<d1;i++){
            for(int j=0;j<d2;j++){
                System.out.print(a2[i][j]+" ");
            }
            System.out.println(" ");
        }
        int[][] r=new int[100][100];
        System.out.println("\nThis is the sum of two matrices");
            for(int i=0;i<d1;i++){
                for(int j=0;j<d2;j++) {
                    r[i][j] = a[i][j] + a2[i][j];
                    System.out.print(r[i][j] + " ");
                }
                System.out.println(" ");

        }

}
}



import java.util.Scanner;
public class symmetricMatrix{
    public static void main(String[] args){
    System.out.println("This codes contains info about Arrays");
    int[][] a=new int[100][100];
    int[][] b=new int[100][100];
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
            b[i][j]=0;
        }}
    System.out.println("The matrix:");
    for(int i=0;i<b1;i++){
        for(int j=0;j<b2;j++){
            System.out.print(a[i][j]+" ");
            b[i][j]=a[i][j];
        }
        System.out.println(" ");
    }
    System.out.println("Transpose:");
    for(int i=0;i<b2;i++){
        for(int j=0;j<b1;j++){
            System.out.print(a[j][i]+" ");
            b[i][j]=a[j][i];
        }
        System.out.println(" ");
    }
        int check=1;
        for(int i=0;i<b2;i++){
            for(int j=0;j<b1;j++){
                if(b[i][j]!=a[i][j]){
                    check=0;
                    break;
                }
            }}
        if(check==1){
            System.out.print("The matrix is Syemmatric\n");
        }
        System.out.println(" ");



        }}


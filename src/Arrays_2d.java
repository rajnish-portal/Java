import java.util.Scanner;

public class Arrays_2d {
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

                System.out.print("Enter the Value of element you want to search");
                c=sc.nextInt();





            }


    }


import java.util.Scanner;

public class Array_2dSum {  public static void main(String[] args) {
    System.out.println("This codes contains info about Arrays");
    int[][] a = new int[100][100];
    int b1, b2, c;
    System.out.print("enter the number of row you want to enter in Array:");
    Scanner sc = new Scanner(System.in);
    b1 = sc.nextInt();
    System.out.print("enter the number of row you want to enter in Array:");
    b2 = sc.nextInt();
    System.out.println("Enter the value.");
    for (int i = 0; i < b1; i++) {
        for (int j = 0; j < b2; j++) {
            a[i][j] = sc.nextInt();
        }
        System.out.println(" ");

    }
    for (int i = 0; i < b1; i++) {
        for (int j = 0; j < b2; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println(" ");
    }
    System.out.println("Sum of rows:");
    int sum=0;
    for (int i = 0; i < b1; i++) {
        for (int j = 0; j < b2; j++) {
            sum=a[i][j]+sum;
        }
        System.out.println(sum);
        sum=0;
    }
    sum=0;
    System.out.println("Sum of Coloumn:");
    for (int i = 0; i < b2; i++) {
        for (int j = 0; j < b1; j++) {
            sum=a[j][i]+sum;
        }
        System.out.println(sum);
        sum=0;
    }
    sum=0;
    int sum2=0;
    System.out.println("Sum of All element:");
    for (int i = 0; i < b2; i++) {
        for (int j = 0; j < b1; j++) {
            sum=a[j][i]+sum;
        }
        sum2=sum+sum2;
        sum=0;
    }
    System.out.println(sum2);
}}


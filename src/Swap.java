import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        System.out.println("This code swap two number You will enter.");
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print("X:");
        x=sc.nextInt();
        System.out.print("Y:");
        y=sc.nextInt();
        System.out.println("X is "+x+" And y is "+y);
        int c;
        x=x+y;
        y=x-y;
        x=x-y;

        System.out.println("After Swaping X is "+x+" And y is "+y);
    }
}

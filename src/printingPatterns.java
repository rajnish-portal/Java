import java.util.Scanner;

public class printingPatterns {
    public static void main(String[] args){
        System.out.println("This code prints Multiple Patterns.");
            int a=0;
            int i ,j;
            Scanner sw=new Scanner(System.in);
            System.out.print("Enter the maxm number of star you want:");
            a=sw.nextInt();
            for(i=0;i<a;i++){
               for(j=0;j<=a;j++){
                System.out.print("*");}
               System.out.print("\n");
        }

        System.out.print("\n");
        System.out.print("\n");

        a=0;
        i=0;
        j=0;

        System.out.print("Enter the maxm number of star you want:");
        a=sw.nextInt();
        for(i=1;i<=a;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");}
            System.out.print("\n");
        }
        a=0;
        i=0;
        j=0;

        System.out.print("Enter the maxm number of star you want:");
        a=sw.nextInt();
        for(i=a;i>0;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");}
            System.out.print("\n");
        }
        a=0;
        i=0;
        j=0;
        int k=0;

        System.out.print("Enter the maxm number of star you want:");
        a=sw.nextInt();
        for(i=a;i>0;i--){
            for(k=0;k<=i;k++){
                System.out.print(" ");}
            }
            for(j=1;j<=i;j++){
                System.out.print("*");}
            System.out.print("\n");
        }
    }


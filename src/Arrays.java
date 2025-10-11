import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        System.out.println("This codes contains info about Arrays");
        int[] a=new int[100];
        int b,c;
        System.out.print("enter the number of terms you want to enter in Array:");
        Scanner sc=new Scanner(System.in);
        b=sc.nextInt();
        System.out.println("Enter the value.");
        for(int i=0;i<b;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("Enter the Value of element you want to search");
        c=sc.nextInt();
        for(int i=0;i<b;i++){
            if(c==a[i]){
                System.out.println(a[i]+" is present at "+(i+1));
            }

        }



    }
}

import java.util.Scanner;

public class reverseArray {
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
        System.out.print("\n");
        int temp1=0;
        int temp2;
        for(c=0;c<b/2;c++){
            temp1=a[c];
           a[c]= a[b-c-1];
            a[b-c-1]=temp1;
        }
        for(int i=0;i<b;i++){
            System.out.print(a[i]+" ");
        }

    }
}

import java.util.Scanner;

public class findingThePairofSum {
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
        int count=0;
        System.out.print("Enter the Sum you want to find pair:");
        int sum=sc.nextInt();
        for(int i=0;i<b;i++){
            for(int j=i+1;j<b;j++) {
                if (a[i] + a[j] ==sum) {
                    count++;
                    System.out.println("(" + a[i] + ", " + a[j] + ")");
                    a[j]=0;
                }
            }
        }
        System.out.print(count);
    }
}

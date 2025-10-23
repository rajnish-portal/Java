import java.util.Scanner;

public class sortedArray {

    public static boolean Sorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return Sorted(arr, i + 1);  // return added
    }
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
        boolean res = Sorted(a, 0); // store return value
        System.out.println();
        if (res)
            System.out.println("Array is sorted.");
        else
            System.out.println("Array is not sorted.");
    }



    }


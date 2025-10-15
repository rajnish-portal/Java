import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        System.out.println("This is code for Bubble sort");
        int[] a = new int[100];
        System.out.println("Enter the Number of Array you want to enter");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Enter the value of data in the array:");
        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }
        ;
        System.out.println("These are the value of data in the array:");
        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nThese is sorted data");
        for (int i = 0; i < b - 1; i++) {
            for (int j = 0; j < b - i - 1; i++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }

        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + " ");


        }
    }
}
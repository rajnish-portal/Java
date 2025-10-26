import java.util.Scanner;

public class frequencyArray {
    public static void main(String[] args) {
        int n, i, c;
        System.out.print("Enter the number of elements you want in array:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] a = new int[100];
        int[] f = new int[100];

        System.out.print("Enter elements you want in array:");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            f[i] = -1;
        }

        for (i = 0; i < n; i++) {
            c = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    c++;
                    f[j] = 0;  // mark duplicate
                }
            }
            if (f[i] != 0)
                f[i] = c;  // store frequency for unique index
        }

        System.out.println("\nFrequency of each element:");
        for (i = 0; i < n; i++) {
            if (f[i] != 0)
                System.out.println(a[i] + " occurs " + f[i] + " times");
        }
    }
}

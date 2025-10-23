import java.util.Scanner;

public class sumofNTermsRecursion {
    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        int r=n+sum(n - 1);
        return r;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(sum(n));
        }
    }



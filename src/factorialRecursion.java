
import java.util.Scanner;

public class factorialRecursion {
    public static int fact(int r) {
        if (r < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (r == 0 || r == 1) {
            return 1;
        }
        return r * fact(r - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print(fact(r));
        sc.close();
    }
}


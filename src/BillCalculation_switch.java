import java.util.Scanner;

public class BillCalculation_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = scanner.nextInt();

        int rangeKey;
        if (units >= 1 && units <= 100) {
            rangeKey = 1;
        } else if (units >= 101 && units <= 300) {
            rangeKey = 2;
        } else if (units > 300) {
            rangeKey = 3;
        } else {
            System.out.println("Invalid units");
            scanner.close();
            return;
        }

        double bill = 0;
        switch (rangeKey) {
            case 1:
                bill = units * 1.5;
                break;
            case 2:
                bill = 100 * 1.5 + (units - 100) * 2.5;
                break;
            case 3:
                bill = 100 * 1.5 + 200 * 2.5 + (units - 300) * 4;
                break;
        }

        System.out.printf("Electricity bill: %.2f\n", bill);
        scanner.close();
    }
}

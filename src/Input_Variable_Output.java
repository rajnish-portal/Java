import java.util.Scanner;

public class Input_Variable_Output {
    public static void main(String[] args){
        System.out.print("This is A code for text of INPUT_VARIBLES_OPRETORS_OUTPUT\n");
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        a=sc.nextInt();
        b=sc.nextInt();
        int c;
        c=b+a;
        System.out.print("Addition:");
        System.out.println(c);
        int d=b-a;
        System.out.print("Subtraction:");
        System.out.println(d);
        int e=b*a;
        System.out.print("Multiplication:");
        System.out.println(e);
    }
}

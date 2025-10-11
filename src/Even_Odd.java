import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        System.out.print("This Code Check Weather Number Enter is EVEN or ODD\nPlease Enter the Number:");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0){
           System.out.println("The NUmber Enter is Even");
        }
        else {
            System.out.println("The NUmber Enter is Odd");
        }
    }
}

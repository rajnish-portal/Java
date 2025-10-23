import java.util.Scanner;

public class oddevenRecursion {
    public static void oddEven(int s,int e){
        if (s >e) {
            return; }
            if(s%2==0){
                System.out.print(s+" ");
            }
            oddEven(s+1,e);


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        oddEven(s,e);
    }
}

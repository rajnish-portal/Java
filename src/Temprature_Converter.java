import java.util.Scanner;

public class Temprature_Converter {
    public static void main(String[] args){
        System.out.println("This Code Helps You To Change Temprature format.\n Please Choose the option Number From below.");
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Celcius to Farnhait\n2.Farnhiet to Celcius");
        int a;
        a=sc.nextInt();
        float t;
        if(a==1){
            System.out.print("To convert Celcius to Farnheit\n Please Enter in celcius:");
            t=sc.nextFloat();
            float r=((t*9)/5)+32;
            System.out.println(r);
        }
        else {
            System.out.print("To convert Farnheit to Celcius\n Please Enter in farnheit:");
            t=sc.nextFloat();
            float r=((t-32)*5)/9;
            System.out.println(r);
        }
    }
}

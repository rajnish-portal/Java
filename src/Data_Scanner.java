import java.util.Scanner;

public class Data_Scanner {
    public static void main(String[] args){
        System.out.println("This JAVA code is Based on Scanner_output tags");
        String Name;
        String Address;
        String School;
        int date;
        int month;
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        Name= sc.nextLine();
        System.out.print("Enter your Address:");
        Address= sc.nextLine();
        System.out.print("Enter your Collage:");
        School= sc.nextLine();
        System.out.print("Enter your Date(only) of birth:");
        date=sc.nextInt();
        System.out.print("Enter your Month of birth:");
        month= sc.nextInt();
        System.out.print("Enter your Year of birth:");
        year= sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("These are Your Information");
        System.out.println("Name:"+Name);
        System.out.println("Address:"+Address);
        System.out.println("Collage:"+School);
        System.out.println("DOB:"+date+"/"+month+"/"+year);

    }
}

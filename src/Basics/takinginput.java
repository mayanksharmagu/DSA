package Basics;
import java.sql.SQLOutput;
import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
         int n = sc.nextInt();
        System.out.println(n*n);
    }
}

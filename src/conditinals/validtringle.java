package conditinals;

import java.util.Scanner;

public class validtringle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd side : ");
        int c = sc.nextInt();

        if((a+b)>c && (b+c)>a && (a+c)>b) System.out.println("valid traingle");
        else System.out.println("invalid trianle");
    }
}

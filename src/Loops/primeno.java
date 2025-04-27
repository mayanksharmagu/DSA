package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int n = sc.nextInt();

        int x =0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i==0) {
                System.out.println("composite number");
                x = 1;
                break;
            }
        }
        if(n==1) System.out.println("nether prime nor composite no");
        if (x==0) System.out.println("prime number");

    }
}
package Basics;

import java.util.Scanner;

public class halfofgivenintegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x = sc.nextInt();
        double y = (double)x;
        System.out.println(y/2);
    }
}

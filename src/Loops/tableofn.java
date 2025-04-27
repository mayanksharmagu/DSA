package Loops;

import java.util.Scanner;

public class tableofn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value of n :");
        int n = sc.nextInt();
        for(int i=1; i<=100; i++){
            System.out.println(n*i);
        }
    }
}

package Basics;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enater a character : ");
        char x = sc.next().charAt(0);
        System.out.println((int)x);
    }
}

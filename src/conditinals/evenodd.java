package conditinals;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(n%2 == 0) System.out.println("Even");
        if(n%2 == 1) System.out.println("odd");

        if(n%2 == 0) System.out.println("Even");
        else System.out.println("odd");

    }
}

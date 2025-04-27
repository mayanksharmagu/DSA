package patternprinting.triangle;

import java.util.Scanner;

public class startrianglehorizontalyflip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n : ");
        int m = sc.nextInt();
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= m+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

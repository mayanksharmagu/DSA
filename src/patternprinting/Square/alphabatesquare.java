package patternprinting.Square;

import java.util.Scanner;

public class alphabatesquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int m = sc.nextInt();
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print((char)(j+64)+" ");
//                System.out.print((j+64)+" ");
            }
            System.out.println();
        }
    }
}

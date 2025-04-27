package patternprinting.compositepatterns;

import java.util.Scanner;

public class numberpyramidpalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value n : ");
        int m = sc.nextInt();
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <=m-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j =1; j <=i; j++) {
                System.out.print( j + " ");
            }
            for (int j =i-1; j>=1; j--) {
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
}

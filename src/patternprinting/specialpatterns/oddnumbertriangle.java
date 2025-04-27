package patternprinting.specialpatterns;

import java.util.Scanner;

public class oddnumbertriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value");
        int m = sc.nextInt();
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print((2*j-1)+ " ");
//                System.out.print((char) (j+64)+ " ");
            }
            System.out.println();
        }
    }
}

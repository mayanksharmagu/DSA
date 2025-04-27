package patternprinting.triangle;

import java.util.Scanner;

public class question {
    public static void main(String[] args) {
        int m = 5;
        char ch = 'A';
        for (int i = 1; i <= m ; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2!=0){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(ch+" ");
                    ch++;
                }
            }

            System.out.println();
        }
    }
}

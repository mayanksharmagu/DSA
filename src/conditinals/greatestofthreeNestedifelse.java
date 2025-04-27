package conditinals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class greatestofthreeNestedifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no : ");
        int a = sc.nextInt();
        System.out.println("Enter the second no : ");
        int b = sc.nextInt();
        System.out.println("Enter the third no : ");
        int c = sc.nextInt();

        if(a > b){
            if(a > c) System.out.println(a+" is largest");
            else
                System.out.println(c+" is largest");
        }
        else{
            if(b > c) System.out.println(b+ "is largest");
            else
                System.out.println(c+" is largest");
        }
    }
}

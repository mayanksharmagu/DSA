package conditinals;

import java.util.Scanner;

public class leastofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no : ");
        int a = sc.nextInt();
        System.out.println("Enter the second no : ");
        int b = sc.nextInt();
        System.out.println("Enter the third no : ");
        int c = sc.nextInt();

        if(a<=b && a<=c){
            System.out.println(a+" is  least number");
        }
        else if(b<a && b<c){
            System.out.println(b+" is least number");
        }
        else{
            System.out.println(c+" is least number");
        }
    }
}

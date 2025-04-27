package string;

import java.util.Scanner;

public class convertintostring {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter  a number : ");
        int n = sc.nextInt();
        String s = "mayank" +n;
       // String s = Integer.toString(n); // tobuilt in function
        System.out.println(s);
        System.out.println(s.length()); // next question
    }
}

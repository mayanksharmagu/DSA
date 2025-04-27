package Loops;

import java.util.Scanner;

public class AP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

//        for(int i=4;i<=3*n+1; i+=3){
//            System.out.println(i);

        int a = 4, d = 3;
        for(int i=1;i<=n; i++){
            System.out.println(a);
            a +=d;

        }
    }
}

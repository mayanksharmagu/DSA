package recursion;

import java.util.Scanner;

public class sumparamerterrised {
    public  static void sum(int n,int s){
     if(n==0){   //base case
         System.out.println(s);
         return;
     }
      sum(n-1,s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        sum(n,0);
    }
}

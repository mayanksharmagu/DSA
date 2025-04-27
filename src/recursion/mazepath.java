package recursion;

import java.util.Scanner;

public class mazepath {
    public  static  int maze (int row , int col, int m , int n){
        if(row==m ||col==n) return 1;
        int rightWays= maze(row,col+1, m,n);
        int downWays = maze(row+1,col,m,n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m & n : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(maze(1,1,m,n));
    }
}

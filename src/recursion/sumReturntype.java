import java.util.Scanner;

public class sumreturntype {

}public static int sum(int n){
    if (n==1 || n==0) return 1;
    return n+sum(n-1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println( "Enter n : ");
    int n = sc.nextInt();
    System.out.println(sum(n));
}

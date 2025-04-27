package conditinals;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price : ");
        int cp = sc.nextInt();
        System.out.println("Enter selling price : ");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("Profit");
            System.out.println(sp-cp);
        }
        if(cp>sp){
            System.out.println("loss");
            System.out.println(cp-sp);
        }
        if(cp == sp) System.out.println("No profit No loss");

    }
}

package Loops;

public class oddNumber {
    public static void main(String[] args) {
        //100 itrations
//        for (int i= 1; i <=100 ; i++) {
//            if(i % 2!=0) System.out.println(i+" ");

             //50 iterations
//            for (int i= 1; i <=100 ; i+=2) {
//                if(i % 2==0) System.out.println(i+" ");

               //100 iteration(continue)
        for (int i=1; i<=100 ;i++) {
            if (i%2 == 0) {
                continue;
            }
                   System.out.println(i+" ");
            }
    }
}
package array;

public class Basicsyntax {
    public static void main(String[] args) {
        int[] arr= new int[5];
        //intialising individual elements
        arr[0]= 10;
        arr[1]= 20;
        arr[2]= 30;
        arr[3]= 40;
        arr[4]= 50;
        //output of elements
        System.out.print(arr[0]+ " ");
        System.out.print(arr[1]+ " ");
        System.out.print(arr[2]+ " ");
        System.out.print(arr[3]+ " ");
        System.out.print(arr[4]+ " ");
        arr[0]+= 99;  //update
        System.out.println(arr[0]);
    }
}

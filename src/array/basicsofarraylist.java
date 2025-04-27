package array;

import java.util.ArrayList;

public class basicsofarraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>(6);
        arr.add(0,10);//arr[0]= 10
        arr.add(1,30);//initialize
        arr.add(2,40);
        arr.add(3,80);
        arr.add(4,70);
        System.out.println(arr);
        arr.set(2,300);//modify
        System.out.println(arr);
        arr.add(90);//push back
        System.out.println(arr);
    }
}

package array;

import java.util.ArrayList;

public class arraylistsadd {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println(list+" "+list.size());
        list.add(60);
        System.out.println(list+" "+list.size());
        list.add(90);
        System.out.println(list+" "+list.size());
        list.add(700);
        System.out.println(list+" "+list.size());
        list.remove(2);
        System.out.println(list+" "+list.size());
    }
}

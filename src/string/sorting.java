package string;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
         String s = "raghav";
         char[] ch = s.toCharArray();
        Arrays.sort(ch);
        for(char ele : ch){
            System.out.print(ele);
        }
        System.out.println();



        StringBuilder sb = new StringBuilder("garg");
        char[] hh = sb.toString().toCharArray();
        Arrays.sort(hh);
        for(char ele : hh){
            System.out.print(ele);
        }
    }
}
